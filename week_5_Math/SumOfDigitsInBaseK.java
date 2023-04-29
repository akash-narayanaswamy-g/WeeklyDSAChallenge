package week_5_Math;

//1837. Sum of Digits in Base K
public class SumOfDigitsInBaseK {

	public static void main(String[] args) {
		int n = 34, k = 6;
		System.out.println(sumBase(n, k));
	}
	
	public static int sumBase(int n, int k) {
		int sum=0;
	       while(n>0){
	           sum+=n%k;
	           n=n/k;
	       } 
	       return sum;
    }

}
