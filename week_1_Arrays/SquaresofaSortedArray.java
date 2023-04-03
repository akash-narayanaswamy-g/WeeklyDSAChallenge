package week_1_Arrays;

import java.util.Arrays;

//977. Squares of a Sorted Array
public class SquaresofaSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
	
	public static int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
			ans[i]=nums[i]*nums[i];
		}
        Arrays.sort(ans);
        return ans;
    }
}
