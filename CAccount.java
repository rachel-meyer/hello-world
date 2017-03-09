package oop_basics;


public class CAccount extends Account {

	private double charge;
	
	public CAccount(String accountID, String accountName,
	                double amount,double charge) {
		super(accountID, accountName, amount);
	    this.charge = charge;
	}
	
	public CAccount(String accountID, String accountName,
            double amount) {
		this(accountID, accountName, amount, 5.0);
	}
	
	void addCharges() {
		super.withdraw(charge);
	}
	
	void print()   {
		super.print();
		System.out.println("Charge = " + charge);
	}
	  
	public boolean withdraw(double amount) 
	{
		addCharges();
		return(super.withdraw(amount));
	}
	
	public void deposit(double amount) {
		addCharges();
		super.deposit(amount);
	}

}

