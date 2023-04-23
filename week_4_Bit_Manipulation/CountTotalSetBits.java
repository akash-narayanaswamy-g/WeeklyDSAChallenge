package week_4_Bit_Manipulation;

public class CountTotalSetBits {

	public static void main(String[] args) {
		int N = 4;
		System.out.println(countSetBits(N));
	}
	
	public static int countSetBits(int n){
		int table[]=new int[n+1];
		table[0]=0;
		int sum=0;
		for (int i = 1; i <=n; i++) {
			table[i]=table[i&(i-1)]+1;
			sum+=table[i];
		}
	    return sum;
    }

}
