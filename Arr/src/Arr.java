import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {
        String s1 = "lightningbug";
        String e1 = "bug";
        System.out.println(appendIfMissing(s1, e1)); // Output: "lightningbug"

        String s2 = "Airplane II";
        String e2 = ": the Sequel";
        System.out.println(appendIfMissing(s2, e2)); // Output: "Airplane II: the Sequel"
    }

    public static String appendIfMissing(String s, String e) {
        // Check if s already ends with e
        if (s.endsWith(e)) {
            return s; // Return s unchanged if it already ends with e
        } else {
            // Concatenate e to s and return the result
            return s + e;
        }
    }
}

//Write a method called copy, which is passed A[], which is an array of int, and an integer n. 
//method returns a new array consisting of all of the items in A[] which are greater or equal to n.