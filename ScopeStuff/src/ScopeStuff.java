public class ScopeStuff {
	public static void func() {
		int x = 11;
		System.out.println("during x = " + x);
	}	
	public static void main(String []args) {
		int x = 10;
		System.out.println("before x = "+x);
		func();
		System.out.println("after x = "+x);
		
		
	
	}

}
