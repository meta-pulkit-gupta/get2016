package session2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {

	public List<String> readQuestions(String name) {
		List<String> questions = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(name))) {
			String line;
			while ((line = br.readLine()) != null) {
				questions.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return questions;
	}

	public static void fillSurvey(String name) {
		Scanner sc = new Scanner(System.in);
		ReadWriteFile readWriteFile = new ReadWriteFile();
		EvaluateQuestionAnswers evaluateQuestionAnswers = new EvaluateQuestionAnswers();
		String[] answers;
		evaluateQuestionAnswers.questions(readWriteFile.readQuestions(name));
		int numberOfParticipants;
		System.out.println("Enter number of participants: ");
		numberOfParticipants = sc.nextInt();
		sc.nextLine();
		answers = evaluateQuestionAnswers.answers(evaluateQuestionAnswers
				.questions(readWriteFile.readQuestions(name)),
				numberOfParticipants);
		OverallRating overAllRating = new OverallRating();
		System.out.println(overAllRating.generateReport(numberOfParticipants));

	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String name = "D:\\workspace\\OOPS\\bin\\session2\\Question.txt";
		fillSurvey(name);
	}

}
