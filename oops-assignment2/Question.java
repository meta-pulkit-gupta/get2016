package session2;

/**This is a bean class which has three data members.
 * 
 * @author Pulkit Gupta
 */

import java.util.List;

public class Question implements Comparable<Question> {

	String question; // to store the question
	String type; // to store the type of the question.
	List<String> choices; // to store the choice respective of the question.

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

	/**
	 * This is a overridden method that is used to compare to Question objects.
	 * 
	 * @param Question
	 *            It is a question which has to be asked to the participants.
	 * @return a int value according to the comparison of the question data
	 *         member.
	 */
	@Override
	public int compareTo(Question o) {
		String temp = this.getQuestion().split("\\.\\s+")[1];
		String temp1 = o.getQuestion().split("\\.\\s+")[1];
		return temp.toLowerCase().compareTo(temp1.toLowerCase());
	}

}
