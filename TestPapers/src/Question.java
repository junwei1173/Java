public class Question {
	static final int MIN_DIFFICULTY = 1;
    static final int MAX_DIFFICULTY = 10;
	protected int points;
	protected int difficulty;
	protected int answerSpace;
	protected String questionText;
	
		
	public Question(int points, int difficulty, int answerSpace, String questionText) {
	     this.points = points;
	     this.difficulty = difficultyLVL(difficulty);
	     this.answerSpace = answerSpace;
	     this.questionText = questionText;
	}
	public String toString() {
		return questionText;
	}
	public int getPoints() {
		return points;
	}
	public int getdifficulty() {
		return difficulty;
	}
	public int getAnswerSpace() {
		return answerSpace;
	}
	public String getQuestionText() {
		return questionText;
	}
	
	public int difficultyLVL(int difficulty) {
		if (difficulty < MIN_DIFFICULTY) {
            return MIN_DIFFICULTY;
        } else if (difficulty > MAX_DIFFICULTY) {
            return MAX_DIFFICULTY;
        } else {
            return difficulty;
        }
	}
}

