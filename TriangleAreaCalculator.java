import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);

        System.out.println("The area of the triangle is " + area);
    }

    // Method to calculate the area of a triangle using Heron's formula
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}

