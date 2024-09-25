public class Final {
	public static void main(String[] args) {
		System.out.println(f(5));
	}
		public static int f(int x) { 
			 if (x == 0 || x == 1) { 
			 return 2; 
			 } 
			 return 2 * f(x - 1) + 2; 
			 } 
	

}
