public class Flashcard {
	String question;
	String answer;
	
	public Flashcard(String question,String answer) {
		this.question = question;
		this.answer = answer;
		
	}
	public String toString() {
		return "Question: "+question+" Answer: "+answer;
	}
	public boolean equals(Flashcard a) {
		return question.equals(a.question) && answer.equals(a.answer);
	}
	public static void main(String[] args) {
		Flashcard[] flash = new Flashcard[3];
		flash[0] = new Flashcard("Johnny","Cool");
		System.out.println(flash[0]);
	}
	
}
