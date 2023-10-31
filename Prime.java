import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++ ) {
			if (n % i == 0) {
				count ++;
			}
		}
		if (count == 2) {
			System.out.println("The number "+n+" is a prime number");
		}
		else {
			System.out.println("The number "+n+" is a composite number");
		}
	}
}
