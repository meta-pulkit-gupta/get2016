package session1;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Helper {

	public static List<Titles> fetchTitlePublishedByAuthor(String authorName) {
		List<Titles> titles = new ArrayList<Titles>();
		Connection connection = Connector.getConnection();
		String query = "SELECT * FROM titles t "
				+ "INNER JOIN title_author ta ON t.title_id = ta.title_id "
				+ "INNER JOIN author a ON ta.author_id = a.author_id"
				+ " WHERE a.author_name = '" + authorName + "';";
		ResultSet res;
		try {
			Statement statement = connection.createStatement();
			res = statement.executeQuery(query);

			while (res.next()) {
				String title_id = res.getString(1);
				String title_name = res.getString(2);
				String subject_id = res.getString(3);
				String publisher_id = res.getString(4);
				Titles title = new Titles(title_id, title_name, subject_id,
						publisher_id);
				titles.add(title);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connector.closeConnection();
		}
		return titles;
	}

	public static int deleteBooksNotIssuedLast1Year() {
		Connection connection = Connector.getConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		// Saving the current date
		String currentDate = dateFormat.format(cal.getTime());
		String query = "DELETE FROM books WHERE accession_number NOT IN"
				+ " (SELECT DISTINCT bi.accession_number FROM book_issue"
				+ " bi WHERE TIMESTAMPDIFF(YEAR, bi.issue_date, '"
				+ currentDate + "') = 0)";
		int result = 0;
		try {
			Statement statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connector.closeConnection();
		}
		return result;
	}

	public static boolean bookIssuedOrNotByTitle(String title) {
		Connection connection = Connector.getConnection();
		String queryToGetAccessionNumber = "SELECT b.accession_number FROM books b "
				+ "INNER JOIN titles t ON b.title_id = t.title_id AND t.title_name = '"
				+ title + "'";
		ResultSet result;
		ResultSet result1;
		try {
			Statement statement = connection.createStatement();
			result = statement.executeQuery(queryToGetAccessionNumber);
			String accession_number = null;
			while (result.next()) {
				// Checking if the issued book has been returned or not
				accession_number = result.getString(1);
			}
			if (accession_number == null) {
				System.out.println("No book found respect to the title name.");
			} else {
				String query = "SELECT bi.issue_date, bi.accession_number, bi.member_id, br.return_date FROM book_issue bi "
						+ "LEFT JOIN book_return br ON bi.accession_number = br.accession_number AND "
						+ "bi.member_id = br.member_id AND bi.issue_date = br.issue_date "
						+ "WHERE bi.accession_number = '"
						+ accession_number
						+ "'";
				result1 = statement.executeQuery(query);
				while (result1.next()) {
					// Checking if the issued book has been returned or not
					if (result1.getString(4) == null) {
						return true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connector.closeConnection();
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Book :");
		if (bookIssuedOrNotByTitle(sc.nextLine())) {
			System.out.println("Book is not available.");
		} else {
			System.out.println("Book is available");
		}
	}
}
