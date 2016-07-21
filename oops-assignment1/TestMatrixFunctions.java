package session1;

/**Junit for MatrixFunctions class.
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrixFunctions {
	Matrix matrix = new Matrix(3, 3);
	Matrix matrixTranspose = new Matrix(3, 3);
	Matrix matrixMultiplication = new Matrix(3, 3);

	/**
	 * 
	 */
	@Test
	public void testAddElements(){
		assertTrue(matrix.addElements(0, 0, 1));
	}
	
	@Test
	public void testTranspose() {
		matrix.setMatrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		matrixTranspose.setMatrix(new int[][] { { 1, 4, 7 }, { 2, 5, 8 },
				{ 3, 6, 9 } });
		assertEquals(matrixTranspose, MatrixFunctions.transposeOfMatrix(matrix));
	}

	@Test
	public void testMultiplication() {
		matrix.setMatrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		matrixTranspose.setMatrix(new int[][] { { 1, 4, 7 }, { 2, 5, 8 },
				{ 3, 6, 9 } });
		matrixMultiplication.setMatrix(new int[][] { { 66, 78, 90 },
				{ 78, 93, 108 }, { 90, 108, 126 } });

		try {
			// multiplication of the two matrix.
			assertEquals(matrixMultiplication,
					MatrixFunctions.multiplicationOfMatrix(matrix,
							matrixTranspose));
		} catch (Exception e) {
			System.out.println("matrix cant be multiplied.");
		}
	}

	@Test
	public void testShow() {
		assertArrayEquals(matrix.getMatrix(),
				MatrixFunctions.showMatrix(MatrixFunctions
						.transposeOfMatrix(matrixTranspose)));
	}

}