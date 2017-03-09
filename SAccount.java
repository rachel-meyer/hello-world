package oop_basics;


public class SAccount extends Account {

	private double minAmount;
	private static double rate = 0.0;

	public SAccount(String accountID, String accountName,
			        double amount,double minAmount) {
		
	     super(accountID, accountName, amount);
	     this.minAmount = minAmount;
	}

	public SAccount(String accountID, 
		            String accountName, double amount) {
	    this(accountID,accountName,amount,0.0);
	}

	public double getMinAmount() {
		return minAmount;
	}
	
	public static void setRate(double rate) {
		SAccount.rate = rate;
	}
	
	public static double getRate() {
	    return SAccount.rate;
	}

	public double addInterest() { // new method
		double interest = getBalance() * rate/100;
		deposit(interest);  
		return interest;
	}  

	public void addInterest(double rate) {
		deposit(getBalance() * rate/100);  
	}  
	
	public void addInterest(double rate1, double rate2) {
		if (getBalance() < 2000) {
			deposit(getBalance() * rate1/100);
		} else {
			deposit(getBalance() * rate2/100);
		}
	}  
	
	void print()   {
		super.print();
		System.out.println("Min. Amount = " + minAmount);
	}
	  
	public boolean withdraw(double amount) {
	    if (getBalance() - amount >= minAmount)	{
			super.withdraw(amount);
			return true;
	    }
	    else return false;
	}

}
