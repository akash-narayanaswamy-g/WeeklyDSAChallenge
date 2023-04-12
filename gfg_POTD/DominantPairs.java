package gfg_POTD;
import java.util.*;

//Dominant Pairs
public class DominantPairs {

	public static void main(String[] args) {
		int n=4,arr[]={10,2,2,1};
		System.out.println(dominantPairs(n, arr));
	}
	
	public static int dominantPairs(int n, int[] arr) {
		
		Arrays.sort(arr, n/2, n);
	      Arrays.sort(arr, 0, n/2);
	        
	        int sum = 0;
	     
	        for(int i = 0; i < n/2; i++){
	            int s = n/2;
	            int e = n-1;
	            int count = 0;
	            while(s <= e){
	                int mid = (s+e)/2;
	                if(arr[i] >= 5*arr[mid]){
	                    count = (mid-n/2+1);
	                    s = mid+1;
	                }
	                else{
	                    e = mid-1;
	                }
	            }
	            sum += count;
	        }
	        return sum;
	    
		
		//time complexity= n^2
//        int c=0;
//        for (int i = 0; i < n/2; i++) {
//			for (int j = n/2; j < n; j++) {
//				if(arr[i]>=5*arr[j])
//					c++;
//			}
//		}
//        return c;
		
    }

}
