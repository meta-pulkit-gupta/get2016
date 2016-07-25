package tictactoe;

import java.util.Scanner;

/**
 * This is an abstract class for player. there can be human player or bots to
 * play tic tac toe
 * 
 * @author Pulkit Gupta
 *
 */

public abstract class Player {

	public abstract void setSymbol(char symbol);

	public abstract char getSymbol();

	/**
	 * This method is to set a move for the particular player.
	 * 
	 * @param sc
	 *            an object of Scanner class for taking input.
	 */
	public abstract void setMove(Scanner sc);

}
