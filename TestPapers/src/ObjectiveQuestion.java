public class ObjectiveQuestion extends Question {
	private String correctAnswer;
	
	public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
		super(points,difficulty,answerSpace,questionText);
		this.correctAnswer = correctAnswer;
	}
			
	public String toString() {
		String result ="(Points: "+points +" | Difficulty: "+difficulty+") "+questionText;
		
		for (int i = 0; i < answerSpace; i++) {
	        result += "\n";
		}
        return result;
	}
	public String toAnswerString() {
		return questionText +" Correct answer: " + correctAnswer;
	}
}
