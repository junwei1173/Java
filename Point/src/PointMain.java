public class PointMain {
	    public static void main(String args[]) {
		int A[]={10,20,30};
		int B[]=A;
		int C[]=B;

		if (A==C) {
		    System.out.println("equal");
		} else {
		    System.out.println("not equal");
		}
	    }
	}