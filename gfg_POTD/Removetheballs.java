package gfg_POTD;

import java.util.*;

//Remove the balls
public class Removetheballs {

	public static void main(String[] args) {
		int N = 3,color[] = {2, 2, 5},radius[] = {3, 3, 4};
		System.out.println(finLength(N, color, radius));
	}
	
	public static int finLength(int N, int[] color, int[] radius) {
        Stack<int[]> s=new Stack<>();
        for (int i = 0; i < N; i++) {
			if(!s.isEmpty() && s.peek()[0]==color[i] && s.peek()[1]==radius[i])
				s.pop();
			else
				s.push(new int[] {color[i],radius[i]});
		}
        return s.size();
    }

}
