package week_1_Arrays;

import java.util.Arrays;

//1920. Build Array from Permutation
public class BuildArrayfromPermutation {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));

	}
	
	public static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for (int i = 0; i <= ans.length-1; i++) {
			ans[i]=nums[nums[i]];
		}
        return ans;
    }

}
