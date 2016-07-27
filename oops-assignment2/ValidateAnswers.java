package session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class is to validate the answers given by the participants.
 * 
 * @author Pulkit Gupta
 *
 */

public class ValidateAnswers {

	public static List <OverallRating> questions = new ArrayList<OverallRating>();
	private static int i = 0;

	/**
	 * This method is to validate the answers given by the participants.
	 * 
	 * @param question
	 *            An object of question class store the question.
	 * @param answer
	 *            This string comprises the input given to the respective
	 *            question.
	 * @return boolean whether the answer given by the participant is legimate
	 *         or not.
	 */
	public boolean isValidateAnswer(Question question, String answer) {

		// Check for the single select type of questions.
		if (question.getType().equalsIgnoreCase("Single Select")
				&& question.getChoices().contains(answer)) {
			System.out.println(EvaluateQuestionAnswers.numberOfSingleSelectQuestions + " dasd" + i);
			if (i < EvaluateQuestionAnswers.numberOfSingleSelectQuestions) {
				questions.add(new OverallRating(question));
			}
			questions.get(
					i % EvaluateQuestionAnswers.numberOfSingleSelectQuestions)
					.singleSelectReport(answer);
			i++;
			return true;
		} else if (question.getType().equalsIgnoreCase("Multi Select")) {
			// Check for the multi select type of questions.
			Set<String> setOfQuestion = new TreeSet<String>(
					String.CASE_INSENSITIVE_ORDER);
			setOfQuestion.addAll(question.getChoices());
			if (!answer.contains("/") && setOfQuestion.contains(answer)) {
				return true;
			}
			// splits the answer if two fields are selected.
			String[] multiAnswer = answer.split("/");
			for (String s : multiAnswer) {
				if (!setOfQuestion.contains(s)) {
					return false;
				}
			}
			return true;

		} else if (question.getType().equalsIgnoreCase("Number")) {
			// Check for the number type of questions.
			try {
				Integer.parseInt(answer);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		} else if (question.getType().equalsIgnoreCase("Text")) {
			// Check for the Text type of questions.
			return true;
		}
		return false;
	}

}
