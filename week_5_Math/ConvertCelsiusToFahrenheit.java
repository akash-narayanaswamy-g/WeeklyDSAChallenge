package week_5_Math;

//Convert Celsius To Fahrenheit
public class ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {
		int C = 32;
		System.out.println(cToF(C));
	}

	public static double cToF(int C)
    {
    double res;
     res=(32+(9*C)/5);
     return res;
    }
}
