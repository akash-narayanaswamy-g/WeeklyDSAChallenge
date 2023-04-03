package week_1_Arrays;

import java.util.Arrays;

//283. Move Zeroes
public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZeroes(int[] nums) {
	        int c=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=0){
	                nums[c++]=nums[i];
	            }
	        }
	        
	        while(c<nums.length)
	        	nums[c++]=0;
	        
	    }

}
