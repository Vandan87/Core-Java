package oopsconcept;
/* Java Program to demonstrate the use of data abstraction. */
abstract class Shape {
	public abstract double calculateArea();
}

class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

public class DataAbstraction {

	public static void main(String args[]) {
		Shape Circle = new Circle(0.5);
		double circleArea = Circle.calculateArea();
		System.out.println("Area of Circle : " + circleArea);
	}
	
}