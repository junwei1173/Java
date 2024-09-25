import java.util.*;

class PairPrinter {
    public static void printPairs(int[] a) {
        int[] b = a;
        for (int i = 0;i < a.length; i++) {
        	
        	for (int j = 0; j < a.length; j++) {
        		if (a[i] + a[j] == 0) {
        			System.out.println(a[i]+" "+a[j]);
        			
        		}
        	}
        }
    }
    
    
    public static void main(String[] args) {
        int[] a = {2,-1,5,-2,1};
        printPairs(a);
    }
}