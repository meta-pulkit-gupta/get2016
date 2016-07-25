package tictactoe;

/**
 * This is a class to provide a board for a tic tac toe game.
 * 
 * @author Pulkit Gupta
 *
 */
public class Board {
	private static Board boardObject;
	private char board[][];

	private Board() {
		board = new char[3][3]; // creates a 3X3 matrix
		boardSpace();
	}

	/**
	 * This is to fill the 2D array with spaces in it.
	 */
	private void boardSpace() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	/**
	 * This method is to return an instance of a Board class.
	 * 
	 * @return instance of Board class
	 */
	public static Board getBoardInstance() {
		if (boardObject == null) {
			boardObject = new Board();
		}
		return boardObject;
	}

	public char[][] getBoard() {
		return board;
	}

	/**
	 * This method is to play the move on the board, means it stores the move in
	 * the matrix.
	 * 
	 * @param row
	 *            the row number
	 * @param column
	 *            column number
	 * @param player
	 *            an object of Player class.either can be userplayer or bot.
	 * @return if value is stored then true else false
	 */

	public boolean playMove(int row, int column, Player player) {
		if (board[row][column] == ' ') {
			board[row][column] = player.getSymbol();
			return true;
		}
		return false;
	}

	/**
	 * This method is to print the board on the console
	 * 
	 */

	public void printBoard() {
		for (int i = 0; i < 7; i++) {
			if (i % 2 == 1) {
				for (int j = 0; j < 3; j++) {
					System.out.print("| " + board[i / 2][j] + " ");
				}
				System.out.println("|");
			} else {
				// To print the board borders
				for (int j = 0; j < 3; j++) {
					System.out.print("----");
				}
				System.out.println("-");
			}
		}
		System.out.println();
	}
}