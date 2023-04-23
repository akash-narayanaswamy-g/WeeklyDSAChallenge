package week_4_Bit_Manipulation;

//Rightmost different bit
public class Rightmostdifferentbit {

	public static void main(String[] args) {
		int M = 52, N = 4;
		System.out.println(posOfRightMostDiffBit(M, N));
	}
	
	public static int posOfRightMostDiffBit(int m, int n)
    {
		 if(m==n)return -1;
		int c=0;
		int res=m^n;
		while(res>0) {
			c++;
			if((res&1)==1)
				return c;
			res=res>>1;
		}
		return c;
            
    }

}
