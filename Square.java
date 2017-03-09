package oop_basics;


public class Square extends Shape {
	private double length;
	
	public Square(double length)
	{
		this.length = length;
	}
	
	public double computeArea() {
		return length*length;
	}

	public void print() {
		System.out.println("Length: " + length);
	}

}

