package oop_basics;


public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {		
		return (Math.PI * radius * radius);
	}

	@Override
	public void print() {
		System.out.println("Radius: " + radius);
	}

}

