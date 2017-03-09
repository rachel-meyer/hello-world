package oop_basics;

import java.util.*;

public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		polymorph();
		instanceExample();
		staticExample();
		//testShape();
		noInherit();
		//testException();
	}
	
	/*
	public static void testException() {
		Account dad = new Account("g234","David Brown",2000);
		Scanner console = new Scanner(System.in);
		boolean amountOK = false;
		System.out.println("Enter Amount : ");
		double amount = console.nextDouble();
		while (!amountOK) 
		{
		   try {	
		      dad.withdraw(amount);
		      amountOK = true;
		   }
		   catch (WithdrawException we) {
			   System.out.println("ReEnter Amount : ");
		       amount = console.nextDouble();
		   }
		}
	}
	*/
	

	public static void polymorph() {
		CAccount mum = new CAccount("s123","Mercy Brown",1000.0, 6.0);
		SAccount dad = new SAccount("g234","David Brown",2000.0, 100.0);
		
		final Account current = mum;
		
		current.withdraw(200);
		
//		current = dad;
		current.withdraw(200);
		
		doTransact(mum, 100);	
		doTransact(dad, 100);
		
		doTransfer(mum, dad, 100);
	}
	
	public static void doTransact(Account current, double amount) {
		current.deposit(amount);
		current.withdraw(amount);
		current.print();
	}
	
	public static void doTransfer(Account from, Account to, double amount) {
		to.transfer(from, amount);
		from.print();
		to.print();
	}

	public static void instanceExample() {
		Account[] accounts = new Account[6];
		
		accounts[0] = new SAccount("a432","John Doe", 4000.0);
		accounts[1] = new SAccount("g234","David Brown",2000.0, 100.0);
		accounts[2] = new CAccount("s123","Mercy Brown",1000.0, 6.0);
		accounts[3] = new SAccount("h232","Joe Brown", 3000.0, 100.0);
		accounts[4] = new CAccount("i193","Dan Brown", 5000.0, 6.0);
		accounts[5] = new CAccount("j163","Hano Brown",6000.0, 6.0);
		
		for (int i=0;i<6; i++) {
			if (accounts[i] instanceof SAccount)
			     ((SAccount) accounts[i]).addInterest(1.0);
			else if (accounts[i] instanceof CAccount)
			     ((CAccount)accounts[i]).addCharges();
			accounts[i].withdraw(100);
		}
	}
	
	public static void staticExample() {
/*        SAccount[] accounts = new SAccount[3];
		
		accounts[0] = new SAccount("a432","John Doe", 4000.0);
		accounts[1] = new SAccount("g234","David Brown",2000.0, 100.0);
		accounts[2] = new SAccount("s123","Mercy Brown",1000.0, 6.0);
*/
		SAccount.setRate(1.2);		
/*		accounts[0].addInterest();
		accounts[1].addInterest();
		accounts[2].addInterest();*/

		SAccount.setRate(1.4);
/*		accounts[0].addInterest();
		accounts[1].addInterest();
		accounts[2].addInterest();*/
	}
	
	public static void noInherit() {
		
		Account mum = new SAccount("s123","Mercy Brown",1000.0);
		Account dad = new CAccount("g234","David Brown",2000.0);
		
		mum.withdraw(100);
		
		dad.deposit(150);
		
		dad.transfer(mum,500);
		
		System.out.println("mum bal = "+mum.getBalance());
		System.out.println("dad bal = "+dad.getBalance());
		
	}
	
	public static void Inherit() {
		SAccount mum = new SAccount("s123","Mercy Brown",1000.0, 600.0);
		Account dad = new CAccount("g234","David Brown",2000.0);
		SAccount brother = new SAccount("s123","Mercy Brown",1000.0, 100.0);
		
		mum.withdraw(500);
		dad.withdraw(500);
		dad.deposit(150);
		brother.withdraw(500);
		brother.addInterest(5.5);
		brother.addInterest(5.5,10.0);
		
		mum.print();
		dad.print();
		brother.print();
	}
}

