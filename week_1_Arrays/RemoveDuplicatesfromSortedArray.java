package week_1_Arrays;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) 
    {
        int c=0;
        for (int i = 1; i < nums.length; i++) {
			if(nums[c]!=nums[i]) {
				nums[c+1]=nums[i];
				c++;
			}
		}
        return c+1;
    }

}
