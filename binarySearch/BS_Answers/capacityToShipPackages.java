package binarySearch.BS_Answers;

public class capacityToShipPackages {
    
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE, high = 0;

        for(int i=0; i<n; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while(low <= high) {
            int mid = (low + high) / 2;
            int minDays = findDays(weights, mid);

            if(minDays <= days) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int findDays(int[] weights, int mid) {
        int day = 1, load = 0, n = weights.length;

        for(int i=0; i<n; i++) {
            if(load + weights[i] > mid) {
                day += 1;
                load = weights[i];
            }
            else {
                load += weights[i];
            }
        }

        return day;
    }
}
