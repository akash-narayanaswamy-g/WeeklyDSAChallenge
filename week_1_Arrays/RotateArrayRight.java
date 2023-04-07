package week_1_Arrays;

import java.util.*;

public class RotateArrayRight {
	public static void main(String[] args) {
        int [] arr ={3,4,5,6,7,8,9};
        int j =3;
        j=j%arr.length;
        int flag = arr.length -j;

		RotateToRight(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		RotateToRight(arr,0,flag-1);
		System.out.println(Arrays.toString(arr));
		RotateToRight(arr,flag,arr.length-1);
		System.out.println(Arrays.toString(arr));
        System.out.println("ROTATE THE ARRAY K TIMES TO RIGHT");
        System.out.println(Arrays.toString(arr));
    }
    public static void RotateToRight(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}