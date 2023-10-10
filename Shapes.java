//Write a Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.
//
//SAMPLE
//
//Enter the Base of the Triangle 12.5
//
// Enter the Height of the Triangle 13.5 
//
//Enter the width of the Rectangle 15 
//
//Enter the Height of the Rectangle 30 
//
//Enter the Radius of the Circle 17.5
//
//Area of Triangle with base: 12.5 and height: 13.5 is: 84.375 
//
//Area of Rectangle with width: 15 and length: 30 is: 450 
//
//Area of Circle with radius: 17.5 is: 961.625

import java.util.Scanner;
public class Shapes {
	public static void main(String[] args) {
		Area area = new Area();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Base of the Triangle: ");
		float trianglebase = scan.nextFloat();
		System.out.println("Enter the Height of the Triangle: ");
		float triangleheight = scan.nextFloat();
		System.out.println("Enter the width of the Rectangle: ");
		int rectanglewidth = scan.nextInt();
		System.out.println("Enter the Height of the Rectangle: ");
		int rectangleheight = scan.nextInt();
		System.out.println("Enter the radius of the circle: ");
		float radius = scan.nextFloat();
		System.out.println("Area of Triangle with base: "+trianglebase+ " and height: "+triangleheight+" is: "+area.Shapearea(triangleheight, trianglebase));
		System.out.println("Area of Rectangle with width: "+rectanglewidth+" and length "+rectangleheight+" is: "+area.Shapearea(rectanglewidth,rectangleheight));
		System.out.println("Area of Circle with radius: "+radius+" is: "+area.Shapearea(radius));
		
		
	}

}
class Area{
	static float Shapearea(float triangleh, float triangleb) {
		float area = 0.5f*triangleh*triangleb;
		return area;
	}
	static int Shapearea(int length, int breadth ) {
		int area =  length*breadth;
		return area;
	}
	static float Shapearea(float radius) {
		float area = 3.14f*radius*radius;
		return area;
	}
}
