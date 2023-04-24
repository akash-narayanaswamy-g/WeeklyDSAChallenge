package gfg_POTD;

import java.util.*;

//Nearest smaller tower
public class Nearestsmallertower {

	public static void main(String[] args) {
		int arr[] = {1,3,2};
		System.out.println(Arrays.toString(nearestSmallestTower(arr)));
	}
	
	static int [] nearestSmallestTower(int [] arr){
		int n = arr.length;
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < n; i++){
		    while(!st.isEmpty() && arr[st.peek()] > arr[i]){
		        ans[st.pop()] = i; 
		    }
		    st.push(i);
		}
		st.clear();
	    
	    
	    for(int i =  n - 1; i >= 0; i--){
	        
	        while(!st.isEmpty() && arr[st.peek()] > arr[i]){
	           int index = ans[st.peek()];
	           if(index == -1) {
	               ans[st.pop()] = i; 
	           }
	            else{
	                int diff1 = Math.abs(st.peek()-index);
	                int diff2 = Math.abs(st.peek()-i);
	                if(diff1 > diff2)  ans[st.pop()] = i; 
	                else if(diff2 > diff1)  ans[st.pop()] = index;
	                else if (diff1 == diff2){
	                    if(arr[index] < arr[i])
	                        ans[st.pop()] = index;
	                   else
	                        ans[st.pop()] = i; 
	                }
	                else break;
	            }
	        }
	        st.push(i);
	    }
		return ans;
	}

}
