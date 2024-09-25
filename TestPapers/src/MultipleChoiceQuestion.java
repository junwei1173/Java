import java.util.*;
public class MultipleChoiceQuestion extends Question {
	private String correctAnswer;
	private ArrayList<String> possibleAnswers;
	
	public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
	}
	
	public List<String> getPossibleAnswers() {
		return possibleAnswers;
	}
	public String toString() {
		String result = questionText + "\n";
		for (int i = 0; i<possibleAnswers.size();i++) {
			result += (i+1)+". "+possibleAnswers.get(i)+"\n";
			for (int j = 0; j < answerSpace; j++) {
		        result += "\n";
			}
		}
		return "(Points: "+points +" | Difficulty: "+difficulty+")"+result;
	}
	public String toAnswerString() {
        String result = questionText + "\n";
        for (int i = 0; i < possibleAnswers.size(); i++) {
            if (possibleAnswers.get(i).equals(correctAnswer)) {
                result += (i+1) + ". **** " + possibleAnswers.get(i) + " ****\n";
            } else {
                result += (i+1) + ". " + possibleAnswers.get(i) + "\n";
            }
        }
        return result;
    }

}