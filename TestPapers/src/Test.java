import java.util.*;
public class Test {
	private ArrayList<Question> questions;
	private int totalPoints;
	
	public Test() {
		questions = new ArrayList<>();
		totalPoints = 0;
	}
	public void addQuestion(Question question) {
        questions.add(question);
        totalPoints += question.getPoints();
    }
	public String toString() {
		String result = "Total Points: "+totalPoints+"\n";
        for (int i = 0; i < questions.size(); i++) {
            result += questions.get(i) + "\n";
        }
        return result;
	}
	public String toAnswerString() {
        String result = "";
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            if (question instanceof ObjectiveQuestion) {
                result += ((ObjectiveQuestion)question).toAnswerString()+"\n"+"\n";
            } else if (question instanceof FillInTheBlankQuestion) {
                result += ((FillInTheBlankQuestion)question).toAnswerString()+"\n"+"\n";
            } else if (question instanceof MultipleChoiceQuestion) {
                result += ((MultipleChoiceQuestion)question).toAnswerString()+"\n"+"\n";
            }
        }
        return result;
    }
}
        
        
        
