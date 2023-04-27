package week_4_Bit_Manipulation;

public class PowerOf2 {

	public static void main(String[] args) {
		int n=98;
		System.out.println(isPowerofTwo(n));
	}
	
	public static boolean isPowerofTwo(long n){
		if(n==0)
            return false;
    return (n&(n-1))==0;
    }

}
