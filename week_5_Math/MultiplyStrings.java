package week_5_Math;

//43. Multiply Strings
public class MultiplyStrings {

	public static void main(String[] args) {
		String num1 = "2", num2 = "3";
		System.out.println(multiply(num1, num2));
	}
	
	public static String multiply(String num1, String num2) {
		return String.valueOf((new java.math.BigInteger(num1)).multiply(new java.math.BigInteger(num2)));
    }
}
