package week_5_Math;

import java.util.Arrays;

//2160. Minimum Sum of Four Digit Number After Splitting Digits
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

	public static void main(String[] args) {
		int num = 2932;
		System.out.println(minimumSum(num));
	}
	
	public static int minimumSum(int num) {
        int[] a=new int[4];
        int i=0;
        while(num>0) {
        	a[i++]=num%10;
        	num/=10;        			
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return (a[0]*10+a[3]+a[1]*10+a[2]);
    }

}
