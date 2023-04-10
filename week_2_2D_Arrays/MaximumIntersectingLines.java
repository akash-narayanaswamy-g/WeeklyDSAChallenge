package week_2_2D_Arrays;

import java.util.*;

public class MaximumIntersectingLines {

	public static void main(String[] args) {
		int N = 4,lines[][] = {{1,3}, {2,3}, {1,2}, {4,4}};
		System.out.println(maxIntersections(lines, N));

	}
	
	public static int maxIntersections(int[][] lines, int N) {
        Map<Integer, Integer> endpoints = new TreeMap<>();

    
    for (int[] line : lines) {
        endpoints.put(line[0], endpoints.getOrDefault(line[0], 0) + 1);

        endpoints.put(line[1] + 1, endpoints.getOrDefault(line[1] + 1, 0) - 1);
    }

    int intersections = 0;
    int activeLines = 0;
    for (int count : endpoints.values()) {
        activeLines += count;
        intersections = Math.max(intersections, activeLines);
    }

    return intersections;
    
    
    }

}
