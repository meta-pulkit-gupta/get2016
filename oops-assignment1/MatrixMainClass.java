package session1;

import java.util.Scanner;

public class MatrixMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix transposeOfMatrix;
		// Enter number of rows and column
		System.out.println("Enter rows and column");
		int numberOfRows = sc.nextInt(), numberOfColumns = sc.nextInt();
		System.out.println("");
		Matrix matrix = new Matrix(numberOfRows, numberOfColumns);
		for (int i = 0; i < numberOfColumns; i++) {
			for (int j = 0; j < numberOfRows; j++) {
				System.out.print("Enter value for " + (i + 1) + " " + (j + 1));
				matrix.addElements(i, j, sc.nextInt());
				System.out.println("");
			}

		}

		System.out.println("The original matrix is:");
		printMatrix(MatrixFunctions.showMatrix(matrix));
		//Transpose of matrix
		transposeOfMatrix = MatrixFunctions.transposeOfMatrix(matrix);
		printMatrix(MatrixFunctions.showMatrix(transposeOfMatrix));

		try {
			//multiplication of the two matrix.
			printMatrix(MatrixFunctions.showMatrix(MatrixFunctions
					.multiplicationOfMatrix(transposeOfMatrix, matrix)));
		} catch (Exception e) {
			System.out.println("matrix cant be multiplied.");
		}
	}
	
	/**Print the matrix.
	 * 
	 * @param matrix print the 2D matrix.
	 */

	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "	");
			}
			System.out.println("");
		}
	}

}