package week_1_Arrays;

//Make Array Elements Equal
public class MakeArrayElementsEqual {

	public static void main(String[] args) {
		System.out.println(minOperations(3));

	}
	
	public static long minOperations(int N) {
        long   n = N/2;
        if(N%2 != 0) return (n*(n+1));
        else return (n*N)/2;
    }

}
