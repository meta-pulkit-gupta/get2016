package session1;
import java.util.Scanner;

/**
 * Delete all those books which were not issued in last 1 year. Return the number of books deleted.
 * @author Pulkit Gupta
 *
 */
public class DeleteBooks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Deleting the books which were not issued in the past one year");
		System.out.println("Number of books deleted "
				+ Helper.deleteBooksNotIssuedLast1Year());
	}
}
