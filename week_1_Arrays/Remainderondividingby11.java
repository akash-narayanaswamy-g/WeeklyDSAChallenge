package week_1_Arrays;

public class Remainderondividingby11 {

	public static void main(String[] args) {
		String x = "1345";
		System.out.println(xmod11(x));
	}
	
	static int xmod11(String x)
	{    
		int sum=0;
	    for (int i = 0; i < x.length(); i++) {
			sum=(10*sum+(x.charAt(i)-'0'))%11;
		}
	    return sum;
	}

}
