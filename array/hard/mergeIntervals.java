package array.hard;

import java.util.*;
public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        // int arr[][] = new int[n][m];
        List<List<Integer>> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(arr.isEmpty() || intervals[i][0] > arr.get(arr.size()-1).get(1)) {
                arr.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else {
                // arr[i][1] = Math.max(intervals[i][1], arr[i][1]);
                arr.get(arr.size() - 1).set(1, Math.max(arr.get(arr.size() - 1).get(1), intervals[1][1]));

            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
