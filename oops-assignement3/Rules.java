package tictactoe;

/**
 * This is to check the conditions for win,lose or draw.
 * 
 * @author Pulkit Gupta
 *
 */

public class Rules {

	/**
	 * This method is to check the win condition.
	 * 
	 * @param board
	 *            a 2D matrix of char.
	 * @param symbol
	 *            char which is the symbol use to entry the player's move.
	 * @return true or false whether the wincondition occured or not.
	 */
	public boolean winCondition(char[][] board, char symbol) {
		for (int i = 0; i < 3; i++) {
			// check for the horizontal pair.
			if ((board[i][0] == symbol) && (board[i][1] == symbol)
					&& (board[i][2] == symbol)) {
				return true;
			} else if ((board[0][i] == symbol) && (board[1][i] == symbol)
					&& (board[2][i] == symbol)) {
				// checks for the vertical pair.
				return true;
			}
		}
		// checks for the diagonal pairs
		if (((board[0][0] == symbol) && (board[1][1] == symbol) && (board[2][2] == symbol))) {
			return true;
		}
		// check for the other diagonal pair.
		if (((board[0][2] == symbol) && (board[1][1] == symbol) && (board[2][0] == symbol))) {
			return true;
		}
		return false; // return false if no win condition fulfilled yet.
	}

	/**
	 * This method is to check the condition of draw if all the cells have been
	 * filled by the players
	 * 
	 * @param board
	 *            a board of char on which the game is played
	 * @return boolean if the condition of draw has occured or not.
	 */
	public boolean conditionDraw(char[][] board) {
		boolean result = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					result = false;
					break;
				}
			}
			if (!result) {
				break;
			}
		}
		return result;
	}
}
