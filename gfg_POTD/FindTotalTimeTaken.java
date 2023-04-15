package gfg_POTD;

import java.util.*;

//Find Total Time Taken
public class FindTotalTimeTaken {

	public static void main(String[] args) {
		int n = 4,arr[] = {1, 2, 3, 3},time[] = {1, 2, 3, 4};
		System.out.println(totalTime(n, arr, time));

	}
	
	public static long totalTime(int n,int arr[],int time[])
    {
		HashMap<Integer, Integer>map = new HashMap<>();
        long totalTime = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                totalTime = Math.max(totalTime, map.get(arr[i]) + time[arr[i] - 1]);
                map.put(arr[i], (int)totalTime);
            }
            else{
                map.put(arr[i], (int)totalTime);
            }
            totalTime++;
        }
        return totalTime - 1;
    }

}
