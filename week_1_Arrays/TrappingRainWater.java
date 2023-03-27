package week_1_Arrays;

//42. Trapping Rain Water
public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = {4,2,0,3,2,5};
		System.out.println(optimaltrap(height));

	}
	
	private static int optimaltrap(int[] height) {
		int res=0;
		int left = 0;
        int right = height.length-1;

        int maxleft = 0;
        int maxright = 0;

        while(left <= right){

            if(height[left] <= height[right]){

                if(height[left] >= maxleft){
                    maxleft = height[left];
                }
                
                else{
                    res += maxleft - height[left];
                }
                left++; 
            }
            else{
                
                if(height[right] >= maxright){
                    maxright = height[right];
                }
                else{
                    res += maxright - height[right];
                }
                right--;
            }
        }
		return res;
	}

	public static int trap(int[] height) {
		int totalTrap=0;
		if(height.length<3)return totalTrap;
		int lb,rb,waterLevel,waterStored;
		for (int i = 1; i < height.length-1; i++) {
			lb=height[i];
			for (int j = 0; j < i; j++) {
				lb=Math.max(lb, height[j]);				
			}
			rb=height[i];
			for (int k = i+1; k < height.length; k++) {
				rb=Math.max(rb, height[k]);				
			}
			waterLevel=Math.min(lb, rb);
			waterStored=waterLevel-height[i];
			totalTrap+=waterStored;
		}
		return totalTrap;
    }

}
