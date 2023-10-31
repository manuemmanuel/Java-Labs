import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scan.nextInt();
		int [] numbers = new int[10];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n;i++) {
			numbers[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (numbers[i] < numbers[i+1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
			}
		}
		System.out.println("The smallest number is "+numbers[n-1]);
	}

}
