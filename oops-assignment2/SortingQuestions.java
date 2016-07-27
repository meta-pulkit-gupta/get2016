package session2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * This class is to sort the questions according to the ascending alphabetic
 * order
 * @author Pulkit Gupta
 *
 */

public class SortingQuestions {

	/**
	 * This method is to sort the given questions.
	 * 
	 * @param filePath
	 *            takes the file path of the file from which the questions has
	 *            to be fetched.
	 * @return An object of Iterator class which iterates the List of questions.
	 */
	public Iterator<Question> sortQuestions(String filePath) {
		EvaluateQuestionAnswers evaluateQuestionAnswers = new EvaluateQuestionAnswers();
		List<Question> allQuestions = evaluateQuestionAnswers
				.question(filePath);
		Collections.sort(allQuestions); // sort the whole list of question.
		return allQuestions.iterator();
	}

	/**
	 * to launch the program
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortingQuestions sort = new SortingQuestions();
		System.out.println("Enter the file path of questions");
		// String name = sc.nextLine(); // to take the file path from the user.
		String filePath = "C:\\Users\\admin\\workspace\\OOPS\\src\\session2\\Question.txt";
		Iterator<Question> itr = sort.sortQuestions(filePath);
		while (itr.hasNext()) {
			System.out.println(itr.next().getQuestion());
		}
	}

}
