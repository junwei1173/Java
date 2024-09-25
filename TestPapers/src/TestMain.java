import java.util.*;
import java.io.*;
public class TestMain {
	public static void main(String[] args) throws IOException{
		Test test = new Test();

        // Adding objective questions
        test.addQuestion(new ObjectiveQuestion(10, 1, 3, "Find the antiderivative of 2cos + 3/x", "2sin + 3ln(x) + C"));
        test.addQuestion(new ObjectiveQuestion(5, 2, 2, "Most famous NBA player with the number 23?", "Michael Jordan"));

        test.addQuestion(new FillInTheBlankQuestion(2, 3, 2, "________is the color of the sky .", "Blue"));

        test.addQuestion(new MultipleChoiceQuestion(5, 4, 1, "Who is Goku's oldest child from Dragon Ball?",
                new ArrayList<>(Arrays.asList("Goten", "Gohan", "Trunks", "Vegeta")),
                "Gohan"));

        
        System.out.println("Test:");
        System.out.println(test.toString());
        
        System.out.println("Answer Key:");
        System.out.println(test.toAnswerString());
        
        
        //Extra credit (send to a file)
        String testString = test.toString();
        String answerString = test.toAnswerString();
        String testFile = "test.txt";
        String answerKey = "answer.txt";
        
        PrintWriter testWrite = new PrintWriter(new FileWriter(testFile));
        testWrite.print(testString);
        
        PrintWriter answerWrite = new PrintWriter(new FileWriter(answerKey));
        answerWrite.print(answerString);
        
        testWrite.close();
        answerWrite.close();
        
    }
}