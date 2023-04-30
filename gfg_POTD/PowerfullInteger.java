package gfg_POTD;

//Powerfull Integer
public class PowerfullInteger {

	public static void main(String[] args) {
		int n=3,intervals[][]={{1,3},{4,6},{3,4}},k=2;
		System.out.println(powerfullInteger(n, intervals, k));
	}
	
	public static int powerfullInteger(int n,int interval[][],int k)
    {
		 int max = Integer.MIN_VALUE;
	        
	        for (int i=0; i < interval.length; i++) {
	            max = Math.max(max, interval[i][1]);
	        }
	        
	        int[] prefix = new int[max + 2];
	        
	        for (int i=0; i < interval.length; i++) {
	            prefix[interval[i][0]]++;
	            prefix[interval[i][1] + 1]--;
	        }
	        
	        int ans = -1;
	        
	        for (int i=1; i < prefix.length; i++) {
	            prefix[i] = prefix[i - 1] + prefix[i];
	            
	            if (prefix[i] >= k) {
	                ans = i;
	            }}
	        return ans;
    }

}
