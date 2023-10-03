import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = new String();
		word = scan.nextLine();
		word = word.toLowerCase();
		char [] wordTwo = word.toCharArray();
		System.out.println("Enter the letter to check frequency: ");
		String letter = scan.next();
		letter = letter.toLowerCase();
		char [] letterTwo = letter.toCharArray();
		int len = word.length();
		int value = frequency(letterTwo, wordTwo,len);
		System.out.println("The frequency count is "+value);
	}
	
static int frequency(char [] letterTwo, char [] word, int len) {
	int count = 0;
	for (int i = 0; i < len;i ++) {
		if (word[i] == letterTwo[0]) {
			count ++;
		}
	}
	return count;
}
}
