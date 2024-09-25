import java.util.*;
public class Exercise2_7_TestReverser {
	public static void main(String[] args) {
		int[] a = {2, 1, 6, 8};
		Exercise2_7_Reverser reverser = new Exercise2_7_Reverser();
		int[] aReversed = reverser.reverse(a);
		System.out.println(Arrays.toString(aReversed));
		
		int[] b = {2, 1, 5};
		int[] bReversed = reverser.reverse(b);
		System.out.println(Arrays.toString(bReversed));
		


	}

}
