public class FractionMain {
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(6,10);
		Fraction fraction2 = new Fraction(2,5);
		
		System.out.println(fraction1.getNum());
		System.out.println(fraction1.getDenom());
		System.out.println(fraction2.getNum());
		System.out.println(fraction2.getDenom());
		System.out.println();
		
		fraction1.setNum(7);
		fraction1.setDenom(5);
		fraction2.setNum(3);
		fraction2.setDenom(6);
		
		System.out.println(fraction1.getNum());
		System.out.println(fraction1.getDenom());
		System.out.println(fraction2.getNum());
		System.out.println(fraction2.getDenom());
		System.out.println();
		
		Fraction result = fraction1.add(fraction2);
		System.out.println(result.toString());
		
		if (fraction1.equals(fraction2)) {
			System.out.println("fraction 1 and fraction 2 match.");
		} else {
			System.out.println("fraction 1 and fraction 2 does not match.");
		}
		System.out.println();
		System.out.println(fraction1.toString());
		System.out.println(fraction2.toString());

	}

}
