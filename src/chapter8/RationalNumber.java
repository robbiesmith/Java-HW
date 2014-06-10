//Daniel Smith 
//714.daniel.smith@gmail.com
package chapter8;
import java.lang.Object;
public class RationalNumber {
	    private int numerator;
	    private int denominator;

	 
	    public RationalNumber(int num, int denom) {
	    numerator=num;denominator=denom;
	    if(denom==0)
	    	throw new IllegalArgumentException();
	    reduce();
	    }
	    public RationalNumber add(RationalNumber temp) {
	        int n = numerator * temp.denominator + temp.numerator * denominator;
	        int d = denominator * temp.denominator;
	        RationalNumber num=new RationalNumber(n,d); num.reduce();
			return num;
	    }
	    public RationalNumber subtract(RationalNumber temp) {
	        int n = numerator * temp.denominator - temp.numerator * denominator;
	        int d = denominator * temp.denominator;
	        RationalNumber num=new RationalNumber(n,d); num.reduce();
			return num;
	    }
	    public RationalNumber divide(RationalNumber temp) {
	        int n = numerator * temp.denominator;
	        int d = denominator * temp.numerator;
	        RationalNumber num=new RationalNumber(n,d); num.reduce();
			return num;
	    }
	    public RationalNumber multiply(RationalNumber temp) {
	        int n = numerator * temp.numerator;
	        int d = denominator * temp.denominator;
	        RationalNumber num=new RationalNumber(n,d); num.reduce();
	    return num;
	    }
	    private int gcd(int x, int y) {
	        while (y != 0) {
	            int temp = x % y;
	            x = y;
	            y = temp;
	        }
	        return x;
	    }
	    private void reduce() {
	        if (denominator < 0) {
	            denominator = -denominator;
	            numerator = -numerator;
	        }
	        int gcd = gcd(Math.abs(numerator), denominator);
	        numerator /= gcd;
	        denominator /= gcd;
	    }	
	    public String toString() {
	        if (denominator == 1) {
	            return "" + numerator;
	        } else {
	            return numerator + "/" + denominator;
	        }
	    }
}

