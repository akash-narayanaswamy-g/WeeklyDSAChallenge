package week_5_Math;

//1822. Sign of the Product of an Array
public class SignoftheProductofAnArray {

	public static void main(String[] args) {
		int[] nums = {-1,-2,-3,-4,3,2,1};
		System.out.println(arraySign(nums));
	}
	
public static int arraySign(int[] nums) {
	int sign = 1;
    
    for (int num : nums) {
        if (num == 0) {
            return 0;
        } else if (num < 0) {
            sign = -sign;
        }
    }
    
    return sign;
    }

}
