package com.ree.current;

public class Current extends com.ree.accounts.Account implements com.ree.accounts.Transactions{

	public Current(long accountNumber,String accountName,String accountAddress,
			double openingBalance){
		
		super(accountNumber,accountName,accountAddress,openingBalance);
	}
	
	
	

	   @Override
	public double withdraw (double amount){
			
			if(getBalance()- amount < 5000){
				System.out.println("Insufficient Funds");
			}else{

				setAccountBalance(getAccountBalance() - amount);
			}
			
			
			return getAccountBalance();
		}
		@Override
	public String toString(){
		return
				"Account Number  : " + getAccountNumber() 		+ "\n" + 
				"Account Name : " + getAccountName() 			+ "\n" + 
				"Account Address  : " + getAccountAddress()		+ "\n" + 
				"Account Type  :  Current(CB) A/c" 				+ "\n" + 
				"Account Balance  : " + getAccountBalance();
	}
		

	
	
	
	
	
	
	
}
