package demo.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoImpl;
import demo.service.WalletService;
import demo.service.WalletServiceImpl;

public class Client {
	public static void main(String[] args)
	{
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
    	WalletService service = (WalletServiceImpl) ctx.getBean("service");
		service.createAccount("RK", "9674632276", 10000);
		service.createAccount("Indranil", "2437656777", 9000);
		service.createAccount("SaiRam", "7664545666", 7000);
		service.createAccount("Pragya", "1212121223", 5000);
		service.createAccount("Teena", "9674645454", 7000);
		
		System.out.println(service.showBalance("2437656777"));
		service.deposit("2437656777", 10000);
		// after depositing amount 
		System.out.println(service.showBalance("2437656777"));
		System.out.println();
		
		System.out.println(service.showBalance("1212121223"));
	    boolean b = service.withdraw("1212121223", 4000);
	    if(b == false)
        {
	    	System.out.println("Invalid amount, Wallet balance insufficient");
	    }
	    System.out.println(service.showBalance("1212121223"));
	    
	    System.out.println(service.showBalance("9674645454"));
	    b = service.withdraw("9674645454", 9000);
	    if(b == false)
        {
	    	System.out.println("Invalid amount, Wallet balance insufficient");
	    }
	    System.out.println(service.showBalance("9674645454"));
	}

}