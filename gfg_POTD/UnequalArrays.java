package gfg_POTD;

import java.util.*;

//Unequal Arrays
public class UnequalArrays {

	public static void main(String[] args) {
		int N = 3,A[] = {2, 5, 6},B[] = {1, 2, 10};
		System.out.println(solve(N, A, B));
	}
	
	public static long solve(int n, int[] A, int[] B) {
		long sum = 0;
	    for (int i = 0; i < n; i++) {
	        sum += (A[i] - B[i]);
	    }
	    if (sum != 0) return -1;
	    List<Integer> Aev = new ArrayList<>();
	    List<Integer> Bev = new ArrayList<>();
	    List<Integer> Aod = new ArrayList<>();
	    List<Integer> Bod = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	        if (A[i] % 2 == 0) Aev.add(A[i]);
	        else Aod.add(A[i]);
	        
	        if (B[i] % 2 == 0) Bev.add(B[i]);
	        else Bod.add(B[i]);
	    }
	    if (Aev.size() != Bev.size()) return -1;
	    Collections.sort(Aev);
	    Collections.sort(Aod);
	    Collections.sort(Bev);
	    Collections.sort(Bod);
	    long diff = 0;
	    for (int i = 0; i < Aev.size(); i++) {
	        diff += Math.abs(Aev.get(i) - Bev.get(i)) / 2;
	    }
	    for (int i = 0; i < Aod.size(); i++) {
	        diff += Math.abs(Aod.get(i) - Bod.get(i)) / 2;
	    }
	    return diff / 2;
    }

}
