package week_1_Arrays;

//Minimum Integer
//https://practice.geeksforgeeks.org/problems/1ccf56f107bcb24242469ea45c02f852165a2184/1
public class MinimumInteger {

	public static void main(String[] args) {
		int N = 3,A[] = { 1, 3, 2};
		System.out.println(minimumInteger(N, A));
	}
	
	public static int minimumInteger(int N, int[] A) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
			sum+=A[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			if(sum<=(long)A[i]*N)
			    min=Math.min(min,A[i]);
		}
		
		return min;
    }

}
