package binarySearch.BS_Answers;

public class KokoEatingBananas {
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0, high = max(piles);

        while(low <= high) {
            int mid = (low + high) / 2;
            int totalH = totalHours(piles, mid);

            if(totalH <= h) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int totalHours(int[] piles, int hour) {
        int n = piles.length;
        int totalH = 0;
        
        for(int i=0; i<n; i++) {
            totalH += Math.ceil((double) piles[i] / (double) hour);
        }

        return totalH;
    }

    public int max(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;

        for(int i=0; i<n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }

        return maxi;
    }
}
