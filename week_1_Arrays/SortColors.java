package week_1_Arrays;

import java.util.Arrays;

//75. Sort Colors

public class SortColors {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	
		public static void sortColors(int[] nums) {
	      int s=0,m=0,e=nums.length-1;
	      for(int i=0;i<nums.length;i++){
	          if(nums[m]==0)
	              swap(nums,s++,m++);
	          else if(nums[m]==1)
	              m++;
	          else
	              swap(nums,m,e--);
	              
	      }
	    }
		static void swap(int[] arr,int n,int n2) {
			int temp=arr[n];
			arr[n]=arr[n2];
			arr[n2]=temp;
		}

}
