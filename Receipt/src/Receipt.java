public class Receipt {
	public static void main (String[] args) {
		int subtotal;
		double tax, tip, total;
		final double taxrate = 0.08;
		final double tiprate = 0.22;
		
		
		subtotal = 38 + 40 + 30;
		tax = subtotal * taxrate;
		tip = subtotal * tiprate;
		total = subtotal + tax + tip;
		
		System.out.println("subtotal:" + subtotal);
		System.out.println("tax:"+tax);
		System.out.println("tip:"+tip);
		System.out.println("total:"+total);
		
	}
}
