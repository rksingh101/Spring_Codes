package demo.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepoInterface;

@Service
(
	value="service" 
)
public class WalletServiceImple implements WalletServiceInterface{
	@Autowired
	private WalletRepoInterface repo;
	//Customer c = new Customer();
	//Wallet w = new Wallet();
	
//	@Autowired
	public WalletServiceImple(WalletRepoInterface repo) {
		this.repo = repo;
			 		}
		
	
	public Customer createAccount(String name, String mobileNumber, float amount) throws ClassNotFoundException, SQLException{
		Customer c = new Customer();
		c.setName(name);
		c.setMobileNumber(mobileNumber);
		Wallet w = new Wallet();
	    w.setBalance(amount);
		c.setWallet(w);
		repo.save(c);
		return c;
			
	}
	/*public Customer showBalance(String mobileNumber){
		return repo.findOne(mobileNumber);
		//return null;
	}
	*/
	
	/*public boolean deposit(String mobileNumber, float amount){
		Customer c;// = new Customer();
		Wallet w ;//= new Wallet();
		 c = repo.findOne(mobileNumber);
		  w = c.getWallet();
		    float currentbalance = w.getBalance();
		    currentbalance = currentbalance + amount;
		    //c.setWallet(w);
		    w.setBalance(currentbalance);
		    c.setWallet(w);
		    repo.save(c);
		return true;
	}


	public boolean withdraw(String mobileNumber, float amount) {
		// TODO Auto-generated method stub
		//Wallet f = w.getbalance();
		Customer c ;//= new Customer();
		Wallet w ;//= new Wallet();
		 c = repo.findOne(mobileNumber);
		//WalletServiceImple c;
	    w = c.getWallet();
	    float balance = w.getBalance();
		if(amount > balance)
		{			return false;
		}
	     //(w.getBalance() - amount);
		balance = balance - amount;
		//c.setWallet(w);
	    w.setBalance(balance);
	    c.setWallet(w);
	    repo.save(c);
		return true;
		 
	}
*/

	//@Override
	//public boolean deposit(String mobileNumber, float amount) {
		// TODO Auto-generated method stub
		//public void deposit_funds( double p_amount)
		
		
		//{
		
		    //  balance += p_amount;
		
		//}

		//return false;
	//}
	
//	 public void sysout()
//	    {
//	        System.out.println("I am Printable Interfacein Parent Class");
//	    }
	

}
