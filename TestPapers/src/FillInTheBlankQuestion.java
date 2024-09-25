public class FillInTheBlankQuestion extends Question {
	private String correctAnswer;
	
	public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
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
        return questionText.replace("________", "___" + correctAnswer + "___");
    }
}


