package session2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ValidateAnswers {
	public boolean isValidateAnswer(Questions question, String answer) {
		if (question.getType().equalsIgnoreCase("Single Select")
				&& question.getChoices().contains(answer)) {
			new OverallRating(question, answer);
			return true;
		} else if (question.getType().equalsIgnoreCase("Multi Select")) {
			Set<String> setOfQuestion = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
			setOfQuestion.addAll(question.getChoices());
			if(!answer.contains("/") && setOfQuestion.contains(answer)){
				return true;
			}
			String[] multiAnswer = answer.split("/");
			for (String s : multiAnswer) {
				Iterator<String> itr = setOfQuestion.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}
				if (!setOfQuestion.contains(s)) {
					return false;
				}
			}
			return true;

		} else if (question.getType().equalsIgnoreCase("Number")) {
			try {
				Integer.parseInt(answer);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		}else if(question.getType().equalsIgnoreCase("Text")){
			return true;
		}
		return false;
	}

}
