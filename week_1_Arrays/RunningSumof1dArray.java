package week_1_Arrays;

import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSumof1dArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
	}
	
	public static int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
	        int sum=0;
	        for (int i = 1; i < nums.length; i++) {
				nums[i]+=nums[i-1];
			}
	        return nums;
    }

}
