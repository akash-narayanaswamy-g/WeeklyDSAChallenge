package week_1_Arrays;

//Equal Left and Right Subarray Sum
public class EqualLeftandRightSubarraySum {

	public static void main(String[] args) {
		int n = 5,A[] = {1,3,5,2,2};
		System.out.println(equalSum(A, n));

	}
	
	static int equalSum(int [] A, int N) {
		if(N==1)return 1;
		for (int i = 1; i < A.length; i++) {
			A[i]+=A[i-1];
		}
		for (int i = 1; i < A.length; i++) {
			if(A[i-1]==(A[N-1]-A[i]))
				return i+1;
		}
		return -1;
	}
}
