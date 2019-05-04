package com.ree.accounts;

public abstract class Account {

	 private long accountNumber;
	 private String accountName;
	 private String accountAddress;
	 private double accountBalance;
	 private String pin;
	 
	 
	 public Account(long accountNumber,String accountName, String accountAddress,
			 double oppeningBalance
			      ) {
		 
		 this.accountNumber = accountNumber;
		 this.accountName = accountName;
		 this.accountBalance = oppeningBalance;
		 this.accountAddress = accountAddress;
		this.pin = generatePin();
	 }
	 
	 public double deposit (double amount) {
		 
		 if(amount <=0) {
			 System.out.println("Cannot deposit negatives");
		 }else {
			 setAccountBalance(getAccountBalance() + amount);
		 }
		 
		 
		 return getAccountBalance();
	 }
	 
	 public boolean changePin(String oldPin, String newPin) {
		 boolean success = true;
		 
		 if(oldPin.equals(newPin)) {
			 success = false;
		 }else if(newPin.equals(new StringBuilder(newPin).reverse().toString() )) {
			 success = false;
		 }else if (newPin.equals("0000") || newPin.equals("1234") ) {
			 success = false;
			 
		 }else {
			 setPIN(newPin);
		 }
		 
		 return success;
	 }
	 
	 public String generatePin() {
		 String PIN = "";
		 java.util.Random random = new java.util.Random();
		 
		 int firstDigit = random.nextInt(10);
		 int secondDigit = random.nextInt(10);
		 int thirdDigit = random.nextInt(10);
		 int fourthDigit = random.nextInt(10);
		 
		 PIN = PIN + firstDigit + secondDigit + thirdDigit + fourthDigit;
		 
		 
		 return PIN;
	 }
	 

		public void setPIN(String PIN){
			this.pin = PIN;
		}
		

		public String getPIN(){
			
			return pin;
		}
		
		public void setAccountBalance(double accountBalance){
			this.accountBalance = accountBalance;
		}
		
		
		public double getAccountBalance(){return accountBalance;}
		
		public double getBalance(){
			return getAccountBalance();
		}

		public void setAccountNumber(long accountNumber){
			this.accountNumber = accountNumber;
		}
		
	   public long getAccountNumber(){
		return accountNumber;
	    }

	    public String getAccountName(){
		return accountName;
	    }
	    
	   public String getAccountAddress(){
		return accountAddress;
	   }
	 
	
	
}
