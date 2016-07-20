package session1;

import java.util.Scanner;

public class MatrixMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix transposeOfMatrix;
		Matrix matrixMultiplication;
		System.out.println("Enter rows and column");
		int numberOfRows = sc.nextInt(), numberOfColumns = sc.nextInt();
		Matrix matrix = new Matrix(numberOfRows, numberOfColumns);
		for(int i = 0; i < numberOfColumns; i++){
			for(int j = 0; j < numberOfRows; j++){
				System.out.print("Enter value for " + (i + 1) + " " + (j + 1));
				matrix.addElements(i, j, sc.nextInt());
				System.out.println("");
			}

		}

		System.out.println("The original matrix is:");
		MatrixFunctions.showMatrix(matrix);
		transposeOfMatrix = MatrixFunctions.transposeOfMatrix(matrix);
		MatrixFunctions.showMatrix(transposeOfMatrix);

		try{
			MatrixFunctions.showMatrix(MatrixFunctions.multiplicationOfMatrix(transposeOfMatrix, matrix));
		}catch(Exception e){
			System.out.println("matrix cant be multiplied.");
		}
	}


}
