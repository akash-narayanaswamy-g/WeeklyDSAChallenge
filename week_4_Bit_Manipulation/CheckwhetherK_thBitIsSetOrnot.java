package week_4_Bit_Manipulation;

//Check whether K-th bit is set or not
public class CheckwhetherK_thBitIsSetOrnot {

	public static void main(String[] args) {
		int N = 4, K = 0;
		System.out.println(checkKthBit(N, K));
	}
	
	static boolean checkKthBit(int n, int k)
    {
		if((n&(1<<k))!=0)
			return true;
				
        return false;
    }

}
