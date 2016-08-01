package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * To evaluate the questions and answers.
 * 
 * @author Pulkit Gupta
 *
 */
public class EvaluateQuestionAnswers {

	ReadWriteFile readWriteFile;
	public static int numberOfSingleSelectQuestions = 0;

	/**
	 * This is to convert the questions fetched from the file in the form of
	 * string to the object of Question class object.
	 * 
	 * @param name
	 * @return
	 */
	public List<Question> question(String name) {
		readWriteFile = new ReadWriteFile();
		List<String> questions = readWriteFile.readQuestions(name);
		List<Question> allQuestions = new ArrayList<Question>();
		Question question;
		String[] section = new String[3];
		List<String> choices = new ArrayList<String>();
		Iterator itr = questions.iterator();
		while (itr.hasNext()) {
			question = new Question();
			section = itr.next().toString().split(", ");
			question.setQuestion(section[0].trim());
			question.setType(section[1].trim());
			if (!section[1].equalsIgnoreCase("Text")) {
				choices = Arrays.asList(section[2].split("/ "));
				question.setChoices(choices);
			}
			if (question.getType().equalsIgnoreCase("Single select")) {
				numberOfSingleSelectQuestions++;
			}
			allQuestions.add(question);
		}
		return allQuestions;
	}

	public String[] answers(List<Question> allQuestions,
			int numberOfParticipants) {
		Scanner sc = new Scanner(System.in);
		Question question;
		ValidateAnswers validateAnswers = new ValidateAnswers();
		String[] answersOfParticipants = new String[numberOfParticipants];
		Iterator<Question> itr;
		String answer = "";
		boolean isRightAnswer = true;
		for (int i = 0; i < numberOfParticipants; i++) {
			itr = allQuestions.iterator();
			System.out.println("Participant " + (i + 1));
			answersOfParticipants[i] = "Participant " + (i + 1);
			while (itr.hasNext()) {
				question = (Question) itr.next();
				do {
					System.out.print(question.getQuestion() + "  ");
					if (!question.getType().equalsIgnoreCase("text")) {
						System.out.println(" "
								+ question.getChoices().toString());
					}
					answer = sc.nextLine().trim();
					isRightAnswer = validateAnswers.isValidateAnswer(question,
							answer);
				} while (!isRightAnswer);
				answersOfParticipants[i] += ", " + answer;
			}
		}
		return answersOfParticipants;
	}

}
