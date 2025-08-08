package binarySearch.BS_Answers;

public class MinimizeDistGasStation {
    
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n = stations.length;
        double low = 0, high = 0;
        
        for(int i=0; i<n-1; i++) {
            high = Math.max(high, (double) (stations[i + 1] - stations[i]));
        }
        
        double diff = 1e-6;
        
        while(high - low > diff) {
            double mid = (high + low) / (2.0);
            int count = countStations(stations, mid);
            
            if(count > k) {
                low = mid;
            }
            else {
                high = mid;
            }
        }
        
        return high;
    }
    
    private static int countStations(int[] stations, double mid) {
        int n = stations.length;
        int count = 0;
        
        for(int i=1; i<n; i++) {
            int num = (int) ((stations[i] - stations[i - 1]) / mid);
            
            if((stations[i] - stations[i - 1]) == num * mid) {
                num--;
            }
            
            count += num;
        }
        
        return count;
    }
}
