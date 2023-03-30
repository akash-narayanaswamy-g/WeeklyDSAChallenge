package week_1_Arrays;

import java.util.*;

//2574. Left and Right Sum Differences
public class LeftandRightSumDifferences {

	public static void main(String[] args) {
		int[] nums = {10,4,8,3};
		System.out.println(Arrays.toString(leftRigthDifference(nums)));
	}
	
	public static int[] leftRigthDifference(int[] nums) {
        int ans[]=new int[nums.length];
        int left=0,right=0;
        
        for (int i = 1; i < ans.length; i++) {
			right+=nums[i];
		}
        
        for (int i = 0; i < ans.length-1; i++) {
			ans[i]=Math.abs(left-right);
			left+=nums[i];
			right-=nums[i+1];
		}
        ans[ans.length-1]=left;
        return ans;
    }


}
