import java.util.StringTokenizer;
import java.util.Scanner;
public class sumOfElementsInAString {
	public static void main(String [] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		StringTokenizer object = new StringTokenizer(scan.nextLine());
		while(object.hasMoreElements()) {
			int data = Integer.parseInt(object.nextToken());
			sum = sum+data;
		}
		System.out.println("The sum of numbers in String: "+sum);
		sc.close();
		}
	}


 
