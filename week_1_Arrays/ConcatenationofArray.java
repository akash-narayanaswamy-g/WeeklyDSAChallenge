package week_1_Arrays;

import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatenationofArray {

	public static void main(String[] args) {
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
	
	public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int c=0;
        for(int i=0;i<nums.length*2;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }

}
