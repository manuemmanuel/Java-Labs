import java.util.Scanner;
public class Matrixmultiplication {
	public static void main(String[] args) {
		int row, column, rows, columns;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the order of the first matrix: ");
		row = scan.nextInt();
		column = scan.nextInt();
		System.out.println("Enter the order of the second matrix: ");
		rows = scan.nextInt();
		columns = scan.nextInt();
		int [][]matrixOne = new int[row][column];
		int [][]matrixTwo = new int[rows][columns];
		if (column == rows) {
			int [][]matrixThree = new int[column][rows];
		    System.out.println("Enter the first matrix: ");
			for (int i = 0; i < row; i++) {
				for  (int j = 0; j < column; j++) {
					matrixOne[i][j] = scan.nextInt();
				}
			}
			System.out.println("Enter the second matrix: ");
			for (int i = 0; i < rows; i++) {
				for  (int j = 0; j < columns; j++) {
					matrixTwo[i][j] = scan.nextInt();
				}
			}
			System.out.println();
			 System.out.println("The first matrix: ");
				for (int i = 0; i < row; i++) {
					for  (int j = 0; j < column; j++) {
						System.out.print(matrixOne[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("The second matrix: ");
				for (int i = 0; i < rows; i++) {
					for  (int j = 0; j < columns; j++) {
						System.out.print(matrixTwo[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
				for (int i = 0; i < rows; i++) {
					for (int j = 0;j < column; j++) {
						matrixThree[i][j] = 0;
						for (int k = 0;k < column;k++) {
							matrixThree[i][j] = matrixThree[i][j] + (matrixOne[i][k]*matrixTwo[k][j]);
						}
					}
				}
				System.out.println("The resultant matrix: ");
				for (int i = 0; i < rows; i++) {
					for  (int j = 0; j < column; j++) {
						System.out.print(matrixThree[i][j]+"\t");
					}
					System.out.println();
				}
				
}
		else {
			System.out.println("The multiplication is not possible between these matrices.");
		}
		
		
	}

}
