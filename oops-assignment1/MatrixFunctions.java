package session1;

/**
 * This class is to implement the functions on the Matrix class.
 * 
 * @author Pulkit Gupta
 *
 */

public class MatrixFunctions {

	/**
	 * This method is to get the transpose of a matrix.An object of matrix is
	 * returned.
	 * 
	 * @param matrix
	 *            The matrix of which the transpose is to be calculated.
	 * @return an object of matrix which is transpose of the argument "matrix"
	 */

	public static Matrix transposeOfMatrix(Matrix matrix) {
		Matrix transposedMatrix = new Matrix(matrix.getNumberOfColumns(),
				matrix.getNumberOfRows());
		int[][] transposeOfMatrix = new int[matrix.getNumberOfColumns()][matrix
				.getNumberOfRows()];
		for (int i = 0; i < matrix.getNumberOfRows(); i++) {
			for (int j = 0; j < matrix.getNumberOfColumns(); j++) {
				transposeOfMatrix[i][j] = matrix.getElement(j, i);
			}
		}
		transposedMatrix.setMatrix(transposeOfMatrix);
		return transposedMatrix;
	}

	/**
	 * This method is to get the multiplication of two matrix.
	 * 
	 * @param matrix1
	 *            is the first matrix.
	 * @param matrix2
	 *            is the second matrix.
	 * @return the multiplication of both matrix.
	 * @throws Exception
	 *             if the number of column of matrix1 is not equal to number of
	 *             rows of matrix2 then the multiplication can;t be implemented.
	 */
	public static Matrix multiplicationOfMatrix(Matrix matrix1, Matrix matrix2)
			throws Exception {
		Matrix matrixMultiplication = new Matrix(matrix1.getNumberOfRows(),
				matrix2.getNumberOfColumns());
		int output[][] = new int[matrix1.getNumberOfRows()][matrix2
				.getNumberOfColumns()];
		if (matrix1.getNumberOfColumns() == matrix2.getNumberOfRows()) {

			for (int i = 0; i < matrix1.getNumberOfRows(); i++) {
				for (int j = 0; j < matrix1.getNumberOfColumns(); j++) {
					for (int k = 0; k < matrix2.getNumberOfColumns(); k++) {
						output[i][j] += matrix1.getElement(i, k)
								* matrix2.getElement(k, j);
					}
				}
			}
			matrixMultiplication.setMatrix(output);
		} else {
			throw new Exception();
		}
		return matrixMultiplication;
	}

	/**
	 * This method shows the matrix.
	 * 
	 * @param matrix
	 *            the matrix that is to be printed is shown.
	 */

	public static int[][] showMatrix(Matrix matrix) {
		return matrix.getMatrix();
	}
}