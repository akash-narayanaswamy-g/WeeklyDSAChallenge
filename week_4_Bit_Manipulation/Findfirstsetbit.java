package week_4_Bit_Manipulation;

//Find first set bit
public class Findfirstsetbit {

	public static void main(String[] args) {
		int N = 18;
		System.out.println(getFirstSetBit(N));

	}
	
	public static int getFirstSetBit(int n){
		int c=0;
        while(n>0) {
            c++;
        	if((n&1)!=0)
        		return c;
        	n=n>>1;
        }
        return c;
    }

}
