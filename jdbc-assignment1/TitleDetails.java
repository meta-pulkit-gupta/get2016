package session1;

import java.util.List;
import java.util.Scanner;

public class TitleDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Author :");
		List<Titles> titles = Helper.fetchTitlePublishedByAuthor(sc.nextLine()
				.trim());
		System.out.println(titles);
	}
}
