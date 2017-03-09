package oop_basics;

public class MotorHome extends Vehicle implements House {
	
	public MotorHome(int num_wheels) {
		super(num_wheels);
	}
	
	public int getNumRooms() {
		return 1;
	}

	public static void main(String[] s) {
		House[] houses = new House[10];
		houses[0] = new MotorHome(1);
		
		Vehicle[] v = new Vehicle[10];
		v[0] = new MotorHome(1);
	}
}
