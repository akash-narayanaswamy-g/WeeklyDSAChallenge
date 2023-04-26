package week_4_Bit_Manipulation;

public class NumberIsSparseOrNot {

	public static void main(String[] args) {
		int N = 2;
		System.out.println(isSparse(N));
	}
	
	public static boolean isSparse(int n)
    {
		return (n&(n<<1))==0;
    }

}
