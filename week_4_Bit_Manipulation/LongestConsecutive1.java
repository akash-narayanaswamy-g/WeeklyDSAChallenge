package week_4_Bit_Manipulation;

public class LongestConsecutive1 {

	public static void main(String[] args) {
		int N = 14;
		System.out.println(maxConsecutiveOnes(N));
	}
	
	public static int maxConsecutiveOnes(int n) {
       int max=Integer.MIN_VALUE;
       int c=0;
       while(n>0) {
    	   if((n&1)!=0)
    		   c++;
    	   else {
    		   max=Math.max(max, c);
    		   c=0;
    	   }
    	   n=n>>1;
       }
       
       return Math.max(max, c);
    }

}
