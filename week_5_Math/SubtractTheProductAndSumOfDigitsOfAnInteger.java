package week_5_Math;

//1281. Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

	public static void main(String[] args) {
		int n = 234;
		System.out.println(subtractProductAndSum(n));
	}
	
	public static int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n>0) {
        	p*=n%10;
        	s+=n%10;
        	n/=10;
        }
        return p-s;
    }

}
