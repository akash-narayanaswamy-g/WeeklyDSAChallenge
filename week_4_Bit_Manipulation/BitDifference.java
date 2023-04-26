package week_4_Bit_Manipulation;

public class BitDifference {

	public static void main(String[] args) {
		int A = 10, B = 20;
		System.out.println(countBitsFlip(A, B));
	}
	
	public static int countBitsFlip(int a, int b){
        return Integer.bitCount(a^b);
    }

}
