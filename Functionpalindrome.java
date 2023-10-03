import java.util.Scanner;
public class Functionpalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = new String();
		word = scan.nextLine();
		char [] wordTwo = word.toCharArray();
		boolean value = palindrome(word,wordTwo);
		if (value == true) {
			System.out.println("This is a Palindrome.");
		}
		else{
			System.out.println("This is not a Palindrome.");
		}
			}
	
static boolean palindrome(String word, char[] wordTwo) {
	int len = word.length();
	int count = 0;
	for (int i = 0; i < len/2; i ++) {
		if (wordTwo[len - i - 1] != wordTwo[i]) {
			return false;
		}
	}
return true;
}

}

