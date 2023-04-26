package week_4_Bit_Manipulation;

//Binary To Gray Code equivalent
public class BinaryToGrayCodeEquivalent {

	public static void main(String[] args) {
		int N = 7;
		System.out.println(greyConverter(N));
	}
	
	public static int greyConverter(int n) {
		return (n^(n>>1));
    }

}
