package gfg_POTD;

import java.util.*;

//Make the array beautiful
public class Makethearraybeautiful {

	public static void main(String[] args) {
		int arr[]={4 ,2 ,-2 ,1};
		System.out.println(makeBeautiful(arr));

	}
	
	public static ArrayList<Integer> makeBeautiful(int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();

		for (int i : arr) {
            if (answer.size() == 0) {
                answer.add(i);
            } else if ((answer.get(answer.size()-1) >= 0 && i < 0) || (answer.get(answer.size()-1) < 0 && i >= 0)) {
                
                answer.remove(answer.size() - 1);  
                
            } else {
                answer.add(i);    
            }
        }
		
		return answer;
    }

}
