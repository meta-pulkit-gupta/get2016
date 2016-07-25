package tictactoe;

import java.util.Scanner;

/**
 * This is to enable a bot to play tic tac toe.
 * 
 * @author Pulkit Gupta
 *
 */

public class Bot extends Player {
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

	/**
	 * checks if the if there is no value at particular row and column.
	 * 
	 * @param row
	 *            the row number
	 * @param column
	 *            the column number
	 * @return true if the element is free else false.
	 */
	public boolean isValidMove(int row, int column) {
		if (board.getBoard()[row][column] == ' ') {
			return true;
		}
		return false;
	}

	@Override
	public void setMove(Scanner sc) {
		int cell;
		int row;
		int column;
		do {
			do{
			cell = (int) (Math.random() * 10);
			}while(cell < 1);
			row = (cell - 1) / 3;
			column = (cell - 1) % 3;
		} while (!isValidMove(row, column));
		board.playMove(row, column, this);
	}
}
