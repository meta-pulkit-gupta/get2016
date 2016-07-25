package tictactoe;

import java.util.Scanner;

/**
 * This class is the encapsulating class of all classes.
 * 
 * @author Pulkit Gupta
 *
 */

public class TicTacToe {

	private static Player players[]; // an array of the Player
	private Rules rule; // to access the methods of rule class.

	public TicTacToe() {
		players = new Player[2]; // creates an array of Player
		rule = new Rules();
	}

	/**
	 * This method ask for the moves played by the users turn by turn.
	 * 
	 * @param scanner
	 *            Takes an object of scanner class
	 */
	public void letGameBegin(Scanner scanner) {
		int n = 0; // increments on every move played by the users.checks for
					// win or draw condition
		boolean result = false; // true if the player wins
		boolean draw = false; // true if the game ties.
		boolean chance = true; // give chance to the users.
		do {
			if (chance) {
				players[0].setMove(scanner);
				if (n > 3) { // from 5th move played.win condition will be
								// checked.
					result = rule.winCondition(Board.getBoardInstance()
							.getBoard(), players[0].getSymbol());
				}
				n++;
				chance = false; // to give the next player chance.
			} else {
				players[1].setMove(scanner);
				if (n > 3) {
					// from 5th move played.win condition will be checked.
					result = rule.winCondition(Board.getBoardInstance()
							.getBoard(), players[1].getSymbol());
				}
				n++;
				chance = true;// to give the first player chance.
			}

			if (n == 8) { // when all players have played there move.checks if
							// the condition of draw is true or not.
				draw = rule.conditionDraw(Board.getBoardInstance().getBoard());
			}
			Board.getBoardInstance().printBoard(); // prints the board for every
													// state
		} while ((!draw) && (!result));

		if (!result) {
			// The game drew
			System.out.println("Game ended in a draw");
		} else {
			if (chance) {
				// Player 2 has won the game
				System.out.println("Player 2 is the winner");
			} else {
				// Player 1 has won the game
				System.out.println("Player 1 is the winner");
			}
		}
	}

	/**
	 * Starts the application
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfHumanPlayers;
		String symbol;
		TicTacToe game = new TicTacToe();

		System.out.println("Welcome to the tic tac toe game.");

		do {

			System.out.println("Enter the number of Human players");
			numberOfHumanPlayers = sc.nextInt();
		} while (!(numberOfHumanPlayers >= 0 && numberOfHumanPlayers < 3));
		sc.nextLine();

		// for taking symbol input
		do {
			for (int i = 0; i < numberOfHumanPlayers; i++) {
				players[i] = new UserPlayer();

				do {
					System.out.println("Enter the symbol for " + (i + 1)
							+ " player[x/0] :");
					symbol = sc.nextLine();

				} while (!(symbol.equalsIgnoreCase("x") || symbol
						.equalsIgnoreCase("0")));
				players[i].setSymbol(symbol.toCharArray()[0]);
			}

			for (int i = numberOfHumanPlayers; i < 2; i++) {
				players[i] = new Bot();

				do {
					System.out.println("Enter the symbol for " + (i + 1)
							+ " player[x/0] :");
					symbol = sc.nextLine();
				} while (!(symbol.equalsIgnoreCase("x") || symbol
						.equalsIgnoreCase("0")));
				players[i].setSymbol(symbol.toCharArray()[0]);
			}
		} while ((players[0].getSymbol() + "").equalsIgnoreCase(players[1]
				.getSymbol() + ""));

		game.letGameBegin(sc);
	}
}
