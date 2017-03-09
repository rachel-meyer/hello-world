package oop_basics;


public class WithdrawException extends Exception {

	public WithdrawException(String errMsg, 
							 double amount) {
	    super(errMsg); 
	    System.out.println("Withdraw " +
	    		 			amount + " failed."); 
		System.out.println("Error message is: " + errMsg);
	}
}

