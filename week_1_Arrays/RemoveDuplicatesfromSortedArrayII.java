package week_1_Arrays;

import java.util.Arrays;

//80. Remove Duplicates from Sorted Array II
public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, removeDuplicates(nums))));
	}
	
	public static int removeDuplicates(int[] nums) {
		int k = 0;
        for(int i = 0 ; i<nums.length; i++){
            int count = 1;
            for (int j = i+1; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    count = count + 1;
                }
            }
            if(count > 2){
                nums[i] = Integer.MAX_VALUE;
                k++;
            }
        }
        Arrays.sort(nums);
        return nums.length-k;


    }

}
