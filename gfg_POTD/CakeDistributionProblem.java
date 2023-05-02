package gfg_POTD;

import java.util.*;

public class CakeDistributionProblem {

	public static void main(String[] args) {
		int N  = 6, K = 2,	sweetness[] = {6, 3, 2, 8, 7, 5};
		System.out.println(maxSweetness(sweetness, N, K));
	}
	
	static int maxSweetness(int [] sweetness, int N, int K) {
		int left = 1, right = 0;
        for(int i=0; i<N; i++) {
            right += sweetness[i];
        }
        int ans = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0, sum = 0;
            for(int i=0; i<N; i++) {
                sum += sweetness[i];
                if(sum >= mid) {
                    count++;
                    sum = 0;
                }
            }
            if(count >= K+1) {
                ans = mid;
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return ans;
	}

}
