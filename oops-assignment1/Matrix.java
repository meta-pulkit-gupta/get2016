package session1;

/**
 * This is a javabean class of matrix.
 * 
 * @author Pulkit Gupta
 *
 */

public class Matrix {

	public int[][] matrix;
	int numberOfRows;
	int numberOfColumns;

	public Matrix(int numberOfRows, int numberOfColumns) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		this.matrix = new int[this.numberOfRows][this.numberOfColumns];
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
		this.numberOfRows = matrix.length;
		this.numberOfColumns = matrix[0].length;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**
	 * This method add value to the element of the specific location given by
	 * row and column.
	 * 
	 * @param row
	 *            gives the row number at which the value is to be added.
	 * @param column
	 *            gives the column number at which the value is to be added.
	 * @param value
	 *            value at the specific element.
	 * @return boolean if element is added or not.
	 */
	public boolean addElements(int row, int column, int value) {
		this.matrix[row][column] = value;
		if (matrix[row][column] == value) {
			return true;
		}
		return false;
	}

	public int getElement(int row, int column) {
		return this.matrix[row][column];
	}

	@Override
	public boolean equals(Object obj) {
		Matrix obj1;
		if (obj instanceof Matrix) {
			obj1 = (Matrix) obj;
		} else {
			return false;
		}
		if (this.getNumberOfRows() == obj1.getNumberOfRows()
				&& this.getNumberOfColumns() == obj1.getNumberOfColumns()) {
			for(int i = 0; i < this.getNumberOfRows(); i++){
				for(int j = 0; j < this.getNumberOfRows(); j++){
					if(this.getElement(i, j) != obj1.getElement(i, j)){
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}

	}
}