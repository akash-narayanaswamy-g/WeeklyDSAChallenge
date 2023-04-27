package week_4_Bit_Manipulation;

//Gray to Binary equivalent
public class GrayToBinaryEquivalent {

	public static void main(String[] args) {
		int n=4;
		System.out.println(grayToBinary(n));
	}
	
	public static int grayToBinary(int n) {
       int c=0;
       while(n>0) {
    	   c^=n;
    	   n>>=1;
       }
       return c;
        
    }

}
