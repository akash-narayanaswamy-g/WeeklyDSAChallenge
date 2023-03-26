package week_1_Arrays;

//11. Container With Most Water
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while(i<j) {
        	if(height[i]>height[j]) {
        		max=Math.max(max,height[j]*(j-i));
        		j--;
        	}
        	else
        	{
        		max=Math.max(max, height[i]*(j-i));
        		i++;
        	}
        }
        return max;
    }

}
