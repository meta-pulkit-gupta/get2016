package session2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * This class is to read questions from the file and writing the answers to the
 * file.
 * 
 * @author Pulkit Gupta
 *
 */

public class ReadWriteFile {

	/**
	 * This method is to read the questions from a file of which the path is
	 * given.
	 * 
	 * @param name
	 *            is the path of the file from which the questions are to be
	 *            fetched.
	 * @return a list of String where every String represents a question with
	 *         its type and choices.
	 */
	public List<String> readQuestions(String name) {
		List<String> questions = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(name))) {
			String line;
			while ((line = br.readLine()) != null) {
				questions.add(line);
			}
		} catch (IOException e) {
			System.out.println("Input output exception generated!");
			e.printStackTrace();
		}
		return questions;
	}

	/**
	 * This method is to write the answers given by the participants to a file.
	 * 
	 * @param answer
	 *            an array of answers given by the participants.
	 * @throws FileNotFoundException
	 *             if the file in which the answers to be write doesnt exits.
	 * @throws UnsupportedEncodingException
	 */

	public void writeAnswers(String[] answer) throws FileNotFoundException,
			UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(
				"C:\\Users\\admin\\workspace\\OOPS\\src\\session2\\Answers.txt",
				"UTF-8");
		for (String s : answer) {
			writer.println(s); // print all the answers of the participants to
								// the file.
		}
		writer.close();
	}

	/**
	 * This is to take the survey for a number of people.
	 * 
	 * @param name
	 *            takes the file path from which the question are to be fetched.
	 */
	public void fillSurvey(String name) {
		Scanner sc = new Scanner(System.in);
		ReadWriteFile readWriteFile = new ReadWriteFile();
		EvaluateQuestionAnswers evaluateQuestionAnswers = new EvaluateQuestionAnswers();
		String[] answers;
		int numberOfParticipants;
		System.out.println("Enter number of participants: ");
		numberOfParticipants = sc.nextInt(); // take the number of participants
												// in the survey
		sc.nextLine();
		answers = evaluateQuestionAnswers.answers(
				evaluateQuestionAnswers.question(name), numberOfParticipants);
		/*
		 * for(StringBuffer s :OverallRating.reports){ System.out.println(s); }
		 */

		try {
			readWriteFile.writeAnswers(answers);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		List<Question> question = evaluateQuestionAnswers.question(name);
		Collections.sort(question, new Comparator<Question>() {

			@Override
			public int compare(Question o1, Question o2) {
				return o1.getQuestion().compareToIgnoreCase(o2.getQuestion());
			}
		});
		generateReport(numberOfParticipants);
	}
	
	/** Generate the report for the single select questions.
	 * 
	 * @param numberOfParticipants takes the number of participants participated in survey.
	 */
	
	public void generateReport(int numberOfParticipants){
		List<OverallRating> list = new ValidateAnswers().questions;
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			list.get(i).generateReport(numberOfParticipants);
		}
	}

	/**
	 * Launches the survey application.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReadWriteFile readWriteFile = new ReadWriteFile();
		System.out.println("Enter the path of the question file?");
		// String filePath = sc.nextLine(); This is to take the question file.
		String filePath = "C:\\Users\\admin\\workspace\\OOPS\\src\\session2\\Question.txt";
		readWriteFile.fillSurvey(filePath);
	}

}
