import java.util.Scanner;
public class Transpose {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the order of the matrix: ");
		int row  = scan.nextInt();
		int column = scan.nextInt();
		int [][]matrix = new int[row][column];
		System.out.println("Enter the matrix: ");
		for (int i = 0; i < row;i++) {
			for (int j = 0;j < column;j++) {
				matrix[i][j] = scan.nextInt();			
				}
		}
		System.out.println();
		System.out.println("The entered matrix is: ");
		System.out.println();
		for (int i = 0; i < row;i++) {
			for (int j = 0;j < column;j++) {
				System.out.print(matrix[i][j]+" ");		
				}
			System.out.println();
		}
		System.out.println();
		System.out.println("The tranpose of the matrix is: ");
		System.out.println();
		for (int i = 0; i < row;i++) {
			for (int j = 0;j < column;j++) {
				System.out.print(matrix[j][i]+" ");		
				}
			System.out.println();
		}
	}
}
