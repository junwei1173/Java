import java.util.*;

public class Lottery
{
   public static void main(String[] args)
   {
      int n = 49; // 1 through n is the set of numbers to draw from
      int k = 6;  // how many numbers will be drawn from this set

      int[] numbers = new int[n];
      // fill the first array with numbers 1 2 3 . . . n
      // YOUR CODE HERE
      for (int i = 0; i<n;i++) {
    	  numbers[i] = i+1;
      }
      System.out.println(Arrays.toString(numbers));


      int[] result = new int[k];
      // draw k numbers from the first array and put them into the second
      // ... YOUR CODE HERE
      for (int i = 0; i < result.length; i++) {
    	  
         // make a random index between 0 and n - 1
    	 int r = (int)(Math.random()*n);
         // pick the element at that random index
         result[i] = numbers[r];

         // move the last element (of the first array) into the random location
         numbers[r] = numbers[n-1];
         n--;
      }
      
      // print the sorted array
      System.out.println("Draw the following integers " +
            "from the set 1 to " + (n + k) + ":");
      for (int r : result) {
    	  System.out.print(r + " ");
      }
   }
}