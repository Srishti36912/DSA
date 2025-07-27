package binarySearch.BS_Answers;

public class MinDaysForMBouquets {
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k;

        if(val > n) {
            return -1;
        }

        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            maxi = Math.max(maxi, bloomDay[i]);
            mini = Math.min(mini, bloomDay[i]);
        }

        int low = mini, high = maxi;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean possible(int[] bloomDay, int day, int m, int k) {
        int n = bloomDay.length;
        int cnt = 0, nB = 0;

        for(int i=0; i<n; i++) {
            if(bloomDay[i] <= day) {
                cnt++;
            }
            else {
                nB += cnt / k;
                cnt = 0;
            }
        }

        nB += cnt / k;
        return nB >= m;
    }
}
