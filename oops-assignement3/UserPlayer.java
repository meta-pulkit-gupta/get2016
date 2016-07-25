package tictactoe;

import java.util.Scanner;

/**
 * This is the class which represent the user player.
 * 
 * @author Pulkit Gupta
 *
 */
public class UserPlayer extends Player {

	Board board = Board.getBoardInstance();
	char symbol;

	@Override
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

	@Override
	public void setMove(Scanner sc) {
		int cell;
		int row;
		int column;
		do {
			System.out.println("Enter the cell number");
			cell = sc.nextInt();
			row = (cell - 1) / 3; // evaluates row on the basis of cell
			column = (cell - 1) % 3; // evaluates column on the basis of cell
		} while (!isValidCell(cell) && !isValidateMove(row, column));
		board.playMove(row, column, this);
	}

	/**
	 * checks if the if there is no value at particular row and column.
	 * 
	 * @param row
	 *            the row number
	 * @param column
	 *            the column number
	 * @return true if the element is free else false.
	 */

	public boolean isValidateMove(int row, int column) {
		if (board.getBoard()[row][column] == ' ') {
			return true;
		}
		return false;
	}

	/**
	 * check whether the cell is valid or not
	 * 
	 * @param cell
	 *            int value for the cell.
	 * @return true or false according to the condition.
	 */
	public boolean isValidCell(int cell) {
		if (cell > 0 && cell < 10) {
			return true;
		}
		return false;
	}

}
