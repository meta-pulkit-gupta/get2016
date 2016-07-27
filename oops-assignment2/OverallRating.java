package session2;

import java.util.Iterator;

/**Overall rating for single select questions.
 * @author Pulkit Gupta
 */
public class OverallRating {
	private int[] answerMarked;
	private Question question;
	private StringBuffer report;
	
	public StringBuffer getReport() {
		return report;
	}

	/**Initialize the members.
	 * @param question takes the question and save it in question object.
	 */
	public OverallRating(Question question) {
		this.question = question;
		answerMarked = new int[question.getChoices().size()];
	}

	 /** Method to increment the count for the chosen option
	 * @param answer - the answer given by the user
	 */
	public void singleSelectReport(String answer) {
		Iterator<String> itr = question.getChoices().iterator();
		int i = 0;
		while (itr.hasNext()) {
			if (answer.equals(itr.next())) {
				answerMarked[i] += 1;
			}
			i++;
		}
	}

	/**Method to generate the report for every single select question.
	 * @param numberOfParticipant total number of participants
	 */
	public void generateReport(int numberOfParticipant) {
		report = new StringBuffer(question.getQuestion() + "\n");
		double percent;
		for (int i = 0; i < answerMarked.length; i++) {
			percent = (answerMarked[i] * 100) / numberOfParticipant;
			report.append(question.getChoices().get(i) + " - " + percent
					+ "%\n");
		}
		System.out.println(report);
	}

}
