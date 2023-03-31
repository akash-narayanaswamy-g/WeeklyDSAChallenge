package week_1_Arrays;

import java.util.Arrays;

//57. Insert Interval
public class InsertInterval {

	public static void main(String[] args) {
		int intervals[][] = {{1,3},{6,9}}, newInterval[] = {2,5};
		System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
	}
	
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            i++;
        }
        int start = i;

        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            i++;
        }

        int end = i;
        int curIntervalCounter = 0;
        int[][] finalIntervals = new int[intervals.length - end + start + 1][];

        for (curIntervalCounter = 0; curIntervalCounter < start; curIntervalCounter++) {
            int[] interval = new int[2];
            interval[0] = intervals[curIntervalCounter][0];
            interval[1] = intervals[curIntervalCounter][1];
            finalIntervals[curIntervalCounter] = interval;
        }

        if (start == end) {
            int[] interval = new int[2];
            interval[0] = newInterval[0];
            interval[1] = newInterval[1];
            finalIntervals[curIntervalCounter++] = interval;
        } else {
            int[] mergedInterval = new int[2];
            mergedInterval[0] = Math.min(newInterval[0], intervals[start][0]);
            mergedInterval[1] = Math.max(newInterval[1], intervals[end - 1][1]);
            finalIntervals[curIntervalCounter++] = mergedInterval;
        }

        for (int j = end; j < intervals.length; j++) {
            int[] interval = new int[2];
            interval[0] = intervals[j][0];
            interval[1] = intervals[j][1];
            finalIntervals[curIntervalCounter++] = interval;
        }

        return finalIntervals;

    }

}
