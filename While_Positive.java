import java.util.Scanner;
public class While_Positive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = 0,sum = 0;
		while (num >= 0){
			num = scan.nextInt();
			System.out.println("Enter the next number: ");
			if (num < 0) {
				break;
			}
			sum = sum + num;
		}
		System.out.println("The sum of the positive numbers is "+ sum);
		}

}
