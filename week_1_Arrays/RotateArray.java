package week_1_Arrays;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        //Declaration Of Array and K value
        int [] nums ={3,4,5,6,7,8,9};
        int k=10;
        k=k%nums.length;
        //Calling the function
        RotateToLeft(nums,0, nums.length-1);
        RotateToLeft(nums, 0, k - 1);
        RotateToLeft(nums, k, nums.length - 1);
        //Printing the output
        System.out.println("ROTATE THE ARRAY K TIMES TO LEFT");
        System.out.println(Arrays.toString(nums));

    }
    public static void RotateToLeft(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}