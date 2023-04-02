package week_1_Arrays;

import java.util.Arrays;

//167. Two Sum II - Input Array Is Sorted

public class TwoSumII_InputArrayIsSorted {

	public static void main(String[] args) {
		int numbers[] = {2,7,11,15}, target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int ans[]= {-1,-1};
        int s=0,e=numbers.length-1;
        while(s<e) {
        	if(numbers[s]+numbers[e]==target) {
        		ans[0]=s+1;
        		ans[1]=e+1;
        		break;
        	}
        	
        	else if(numbers[s]+numbers[e]>target)
        		e--;
        	else if(numbers[s]+numbers[e]<target)
        		s++;
        }
        return ans;
    }

}
