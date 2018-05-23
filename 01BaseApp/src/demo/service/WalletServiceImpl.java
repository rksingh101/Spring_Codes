package demo.service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;

public class WalletServiceImpl implements WalletService{
	
	private WalletRepo repo;
	
		public WalletServiceImpl(WalletRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Customer createAccount(String name, String mobile, float amount) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		customer.setCustomerName(name);
		customer.setMobileNumber(mobile);
		wallet.setBalance(amount);
		customer.setWallet(wallet);
		repo.save(customer);
		return customer;
	}

	@Override
	public Customer showBalance(String mobile) {
		// TODO Auto-generated method stub
		return repo.findOne(mobile);
	}

	@Override
	public boolean deposit(String mobile, float amount) {
		// Updates customer with changes in wallet
		Customer customer;
		customer = repo.findOne(mobile);
		Wallet wallet = customer.getWallet();
		wallet.setBalance(amount+wallet.getBalance());
		repo.save(customer);
		return true;
	}

	@Override
	public boolean withdraw(String mobile, float amount) {
		Customer customer;
		customer = repo.findOne(mobile);
		Wallet wallet = customer.getWallet();
		if(wallet.getBalance() >= amount)
			{
			wallet.setBalance(wallet.getBalance()-amount);
			repo.save(customer);
			return true;
			}
		else
		return false;
	}
	
	

}
