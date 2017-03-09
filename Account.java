package oop_basics;


public abstract class Account {
	private String accID;
	private String name;
	private double balance;
	
	public Account(String accID, String name, double balance)
	{
		this.accID = accID;
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		
		return balance;	
	}
	
	public String getID() {
		return accID;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}

	
	public boolean withdraw(double amount) {
		boolean result = false;

		if ( balance - amount > 0 ) {
			result = true;
			balance -= amount;
		}
		return result;
	}

	/*
	public void withdraw(double amount) throws 
	                                WithdrawException { 
       if (amount > balance) {
          throw new WithdrawException("Amount Not Available",
        		                       amount);
       } 
       balance = balance - amount; 
    }
    */
	
	public boolean transfer(Account acc, double amount) {
		
		if (balance - amount >= 0) {
		     balance = balance - amount; // or  withdraw(amount);
		     acc.deposit(amount);
		     return true;
		}
		else {
			return false;
		}
	}
	
	void print()   {
		  System.out.println("\nAccount ID = " + accID);
		  System.out.println("Name = " + name);
		  System.out.println("Balance = "+ balance);
	}
	
	
	public static void main(String[] args) {
		
		SAccount.setRate(10.0);
		
		Account[] bank = new Account[10];
		bank[0] = new SAccount("x1","me",1000);
		bank[1] = new CAccount("x2","you",2000);
		
		double interest = 0.0;
		for (int i=0; i<bank.length;i++)
			if (bank[i] instanceof SAccount) {
				interest = interest + ((SAccount) bank[i]).addInterest();
			}
		for (int i=0; i<bank.length; i++)
			bank[i].withdraw(10);
	}

}
