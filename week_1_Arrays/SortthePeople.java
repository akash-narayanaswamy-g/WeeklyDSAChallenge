package week_1_Arrays;

import java.util.*;

//2418. Sort the People
public class SortthePeople {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		System.out.println(Arrays.toString(sortPeople(names, heights)));

	}
	
	public static String[] sortPeople(String[] names, int[] heights) {
		String[] res =new String[names.length];
        Map<Integer, String> map = new HashMap();  

        for (int i = 0; i < names.length; i++) map.put(heights[i], names[i]);

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(map);

        int index = res.length - 1;
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            res[index] = entry.getValue();
            index--;
        }
		return res;
    }

}
