package week_5_Math;

//Factorial Of Number
public class FactorialOfNumber {

	public static void main(String[] args) {
		int N = 4;
		System.out.println(factorial(N));
	}
	
	public static long factorial(int N) {
        if(N<=1)return 1;
        long s=1;
        for(int i=2;i<=N;i++){
            s*=i;
        }
        return s;
    }

}
