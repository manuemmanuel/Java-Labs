import java.util.Scanner;
public class SumNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOne, numTwo, numThree;
		System.out.println("Enter first number: ");
		numOne = scan.nextInt();
		System.out.println("Enter second number: ");
		numTwo = scan.nextInt();
		numThree =  numOne + numTwo;
		System.out.println("The sum is "+numThree);
	}
}
