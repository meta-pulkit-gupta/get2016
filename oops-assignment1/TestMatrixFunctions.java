package session1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMatrixFunctions {
	Matrix matrix = new Matrix(3,3);
	Matrix matrixTranspose = new Matrix(3,3);
	Matrix matrixMultiplication = new Matrix(3,3);
	
	
	
	@Test
	public void testTranspose() {
		matrix.setMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		matrixTranspose.setMatrix(new int[][]{{1,4,7},{2,5,8},{3,6,9}});
		assertEquals(matrixTranspose, MatrixFunctions.transposeOfMatrix(matrix));
	}
	
	@Test
	public void testMultiplication() {
		matrix.setMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		matrixTranspose.setMatrix(new int[][]{{1,4,7},{2,5,8},{3,6,9}});
		matrix.setMatrix(new int[][]{{3,6,9},{66,78,90},{90,108,126}});
		assertEquals(matrixTranspose, matrix);
	}
}
