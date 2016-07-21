package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EvaluateQuestionAnswers {
	
	public List<Questions> questions(List<String> questions){
		List<Questions> allQuestions = new ArrayList<Questions>();
		Questions question;
		String []section = new String[3];
		List<String> choices = new ArrayList<String>();
		Iterator itr = questions.iterator();
		while(itr.hasNext()){
			question = new Questions();
			section = itr.next().toString().split(", ");
			question.setQuestion(section[0].trim());
			question.setType(section[1].trim());
			if(!section[1].equalsIgnoreCase("Text")){
				choices = Arrays.asList(section[2].split("/ "));
				question.setChoices(choices);
			}
			allQuestions.add(question);
		}
		return allQuestions;
	}
	
	public String[] answers(List<Questions> allQuestions,
			int numberOfParticipants) {
		Scanner sc = new Scanner(System.in);
		Questions question;
		ValidateAnswers validateAnswers = new ValidateAnswers();
		String[] answersOfParticipants = new String[numberOfParticipants];
		Iterator<Questions> itr;
		String answer = "";
		boolean isRightAnswer = true;
		for (int i = 0; i < numberOfParticipants; i++) {
			itr = allQuestions.iterator();
			System.out.println("Participant " + (i + 1));
			answersOfParticipants[i] = "Participant " + (i + 1) + ": ";
			while (itr.hasNext()) {
				question = (Questions) itr.next();
				do {
					System.out.print(question.getQuestion());
					if (!question.getType().equalsIgnoreCase("text")) {
						System.out.println(" "
								+ question.getChoices().toString());
					}
					answer = sc.nextLine().trim();
					isRightAnswer = validateAnswers.isValidateAnswer(question,
							answer);
				} while (!isRightAnswer);
				answersOfParticipants[i] += answer + ",";
			}
		}
		return answersOfParticipants;
	}
	
	
	

}
