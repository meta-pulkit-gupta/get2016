package session4;

/**This is to solve the NQueenProblem with taking n as an input.
 * 
 * @author Pulkit Gupta
 * @Date 18/07/2016
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueenProblem {

	int countNumberOfSolution = 0;
	int POSSIBLE_TO_PLACE = 1;
	int NOT_POSSIBLE_TO_PLACE = 0;

	/**
	 * This method check if a queen can be placed at this row and column.
	 * 
	 * @param row
	 *            row at which queen to be place
	 * @param column
	 *            column at which queen to be place
	 * @param index
	 *            store column number at which previous queens placed
	 * @return if queen can be placed then 1 if not possible to place queen
	 *         return 0
	 */
	int place(int row, int column, int index[]) {
		for (int i = 1; i < row; i++) {
			if ((index[i] == column || (Math.abs(row - i) == Math.abs(column
					- index[i])))) {
				return 0;
			}
		}
		return 1;
	}

	/**
	 * This method is to check the possible placements for queen in current row.
	 * 
	 * @param currentRow
	 *            choose correct position for queen in this row
	 * @param totalRow
	 *            maximum number of rows
	 * @param index
	 *            store column number at which previous queens placed
	 * @param result
	 *            store all possible results
	 * @return return result
	 */
	public int[][][] queen(int currentRow, int totalRow, int index[],
			int result[][][]) {

		// check all the possible place for queen at current row
		for (int i = 1; i <= totalRow; i++) {
			if (place(currentRow, i, index) == 1) {
				index[currentRow] = i;
				// Base condition and get result for each row
				if (currentRow == totalRow) {
					for (int j = 1; j <= totalRow; j++) {
						result[countNumberOfSolution][j][index[j]] = 1;
					}
					countNumberOfSolution++;
					return result;

				}
				// if more number of row present then check solution for then
				// also
				else {
					queen(currentRow + 1, totalRow, index, result);
				}
			}
		}
		return result;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return user input value
	 */
	public int inputMethod() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {
		int MAX_POSSIBLE_SOLUTION_STORE = 100000;
		NQueenProblem nQueen = new NQueenProblem();
		int boardSize;
		// get the size of board
		System.out.println("Enter the size of board");
		boardSize = nQueen.inputMethod();
		// define size of array according to board size
		int index[] = new int[boardSize + 1]; // store index of queen for each
												// row
		int result[][][] = new int[MAX_POSSIBLE_SOLUTION_STORE][boardSize + 1][boardSize + 1];

		// Call method to get all possible solution
		result = nQueen.queen(1, boardSize, index, result);

		// show all the possible solutions;
		for (int k = 0; k < nQueen.countNumberOfSolution; k++) {
			for (int i = 1; i <= boardSize; i++) {
				for (int j = 1; j <= boardSize; j++) {
					if (result[k][i][j] == 1) {
						System.out.print("Q" + "\t");
					} else {
						System.out.print("0" + "\t");
					}
				}
				System.out.println();
			}
			System.out.println("total result " + nQueen.countNumberOfSolution
					+ " this solution " + (k + 1));
		}
	}

}
