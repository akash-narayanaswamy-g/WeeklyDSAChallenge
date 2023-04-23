package gfg_POTD;

//Minimum Number
public class MinimumNumber {

	public static void main(String[] args) {
		int n = 3,arr[] = {3,2,4};
		System.out.println(minimumNumber(n, arr));
	}
	
	 public static int minimumNumber(int n, int[] arr) {
	        int mini = Integer.MAX_VALUE;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i]%2 != 0) return 1;
	            
	            mini = Math.min(mini, arr[i]);
	        }
	        return mini;
	    
//	        if(n==0 || n==1) return n;
//	        int i=0;
//	        while((1<<i)<=n) i++;
//	        return ((1<<(--i))/2*i)+n-(1<<i)+1+countSetBits(n-(1<<i));
	    }

}
