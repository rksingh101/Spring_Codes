package demo.service;

import demo.beans.Customer;

public interface WalletService {
       public Customer createAccount(String name, String mobile, float amount);
       public Customer showBalance(String mobile);
       public boolean deposit(String mobile, float amount);
       public boolean withdraw(String mobile, float amount);
       
}
