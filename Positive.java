import java.util.Scanner;
public class Positive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,sum = 0;
		System.out.println("Enter a number: ");
		num = 0;
		do {
			num = scan.nextInt();
			if (num < 0) {
				break;
			}
			System.out.println("Enter the next number: ");
			sum = sum + num;
		} while (num >= 0);
		System.out.println("The sum of the positive numbers is "+ sum);
		}
	}
