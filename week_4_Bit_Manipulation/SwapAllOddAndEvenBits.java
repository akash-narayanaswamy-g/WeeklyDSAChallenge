package week_4_Bit_Manipulation;

//Swap all odd and even bits
public class SwapAllOddAndEvenBits {

	public static void main(String[] args) {
		int n=23;
		System.out.println(swapBits(n));
	}
	
	public static int swapBits(int n) 
    {
		int odd=n&(0x55555555);
		int even=n&(0xAAAAAAAA);
		even>>=1;
		odd<<=1;
		return odd|even;
	}

}
