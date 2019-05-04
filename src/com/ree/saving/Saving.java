package com.ree.saving;

public class Saving extends com.ree.accounts.Account implements com.ree.accounts.Transactions{

	
	public Saving(long accountNumber,String accountName,String accountAddress,
			double openingBalance){
		
		super(accountNumber,accountName,accountAddress,openingBalance);
	}
	
	public double withdraw (double amount) {
		
		if(getBalance()-amount < 500) {
			System.out.println("Insufficient funds");
		}else {
			
			setAccountBalance(getAccountBalance()-amount);
		}
		
		
		return getAccountBalance();
	}
	
	
	public String toString() {
		
		return "Account number : " + getAccountNumber() + "\n" +
				"Account Name  : " + getAccountName() + "\n" +
				"Account Address : " + getAccountAddress() + "\n"+
				"Account type :  Savings(C) " 	+  "\n" + 
				"Account Balance : " + getAccountBalance();
	}
	
	
	
	
	
}
