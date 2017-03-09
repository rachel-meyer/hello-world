package oop_basics;


public abstract class Shape {
	 private String colour;	

	 public abstract double computeArea(); 	 
	 public abstract void print(); 
	 
	 public void setColor(String colour) {
		 this.colour = colour;
	 }
	 
	 public String getColor() {
		 return this.colour;
	 }
	 
	 public static void main(String[] args) {
		 Shape[] shapes = new Shape[10];
		 double totalArea = 0;
		 for (int i=0;i<shapes.length; i++)
			 totalArea = totalArea + shapes[i].computeArea();
	 }
	 
}

