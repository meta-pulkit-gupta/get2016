package session2;

import java.util.List;

public class OverallRating {
	private static Questions question;
	private static int[] answerMarked;
	private static List<StringBuffer> reports;

	public OverallRating() {
	}

	public OverallRating(Questions question, String answer) {
		if(!question.getQuestion().equalsIgnoreCase(OverallRating.question.getQuestion()) && question!=null){
			OverallRating.question = question;
			answerMarked = new int[question.getChoices().size()];
		}
		answerMarked[question.getChoices().indexOf(answer)] += 1;
	}

	public List<StringBuffer> generateReport(int numberOfParticipants) {
		StringBuffer singleSelectReport;
		singleSelectReport = new StringBuffer(question.question + ", "
				+ question.type + ", " + question.getChoices().toString()
				+ "\n");
		double percent;
		for (int i = 0; i < question.getChoices().size(); i++) {
			System.out.println(answerMarked[i]);
			percent = (answerMarked[i] * 100) / numberOfParticipants;
			singleSelectReport.append(question.getChoices().get(i) + " - "
					+ percent + " %\n");
		}
		reports.add(singleSelectReport);
		return reports;
	}
}
