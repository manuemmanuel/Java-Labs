import java.util.Scanner;
public class Exceptions {
	public static void main(String[] args) {
		Division();

	}
	public static void Division() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		while (true) {
			System.out.println("Enter the number-1: ");
			int one = scan.nextInt();
			System.out.println("Enter the number-2: ");
			int two = scan.nextInt();
			try {
				result = one / two;
			}
			catch (ArithmeticException e) {
				System.out.println("/ by zero");
			}
			finally {
				System.out.println("Result: "+result);
			}
			System.out.println("End of Operation.");
			System.out.println("Do you want to continue (y/n): ");
			String choice = scan.next();
			char [] answer = choice.toCharArray();
			if (answer[0] == 'n') {
				break;
			}
				
			
		}
		
	}

}
