import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = new String();
		int len = word.length();
		char [] wordThree = new char[10];
		word = scan.next();
		char [] wordTwo = word.toCharArray();
		for (int i = word.length(); i != 0;i--) {
			System.out.print(wordTwo[i-1]);
		}
	}
}



