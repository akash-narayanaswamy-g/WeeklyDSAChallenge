package week_1_Arrays;
import java.util.*;


//1431. Kids With the Greatest Number of Candies
public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int candies[] = {2,3,5,1,3}, extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));

	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>(candies.length);
        //Collections.fill(arr, Boolean.FALSE);
        for (int i = 0; i < candies.length; i++) {
			candies[i]+=extraCandies;
			int max=Arrays.stream(candies).max().getAsInt();
			if(max==candies[i])
				arr.add(true);
			else
				arr.add(false);
			candies[i]-=extraCandies;
		}
        return arr;
    }

}
