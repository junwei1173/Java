public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int n, int d) {
		if (d == 0) {
			throw new ArithmeticException();
		}
		numerator = n;
		denominator = d;
	}
	public int getNum() {
		return numerator;
	}
	public int getDenom() {
		return denominator;
	}
	public void setNum(int n) {
		numerator = n;
	}
	public void setDenom(int d) {
		if (d == 0) {
			throw new ArithmeticException();
		}
		denominator = d;
	}
	public Fraction add(Fraction a) {
		int newNumerator = (numerator*a.denominator) + (denominator*a.numerator);
		int newDenominator = denominator*a.denominator;
		int gcd = findGCD(newNumerator, newDenominator);
		newNumerator/=gcd;
		newDenominator/=gcd;
		return new Fraction(newNumerator,newDenominator);
		
		
	}
	private int findGCD(int n, int d) {
		while (d != 0) {
			int temp = d;
			d = n%d;
			n = temp;
		}
		return Math.abs(n);
		
	}
	public boolean equals(Fraction a) {
		if (((numerator*a.denominator) == (denominator*a.numerator))||((numerator==a.numerator)&&(denominator==a.denominator))) {
			return true;
		}
		return false;
	}
	public String toString() {
		return numerator+"/"+denominator;
	}

}
