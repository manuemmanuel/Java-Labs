//Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). 
//Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. 
//Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures. 
//(Exercise to understand polymorphism).

public class AbstractDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		rectangle.numberOfSides();
		triangle .numberOfSides();
		hexagon.numberOfSides();
		}
}
abstract class Shape{
	abstract public void numberOfSides();
}

class Rectangle extends Shape{
	public void numberOfSides() {
		System.out.println("The number of sides in a Rectangle is 4");
	}
}
class Triangle extends Shape{
	public void numberOfSides() {
		System.out.println("The number of sides in a Triangle is 3");
	}
}
class Hexagon extends Shape{
	public void numberOfSides() {
		System.out.println("The number of sides in a Hexagon is 6");
	}
}