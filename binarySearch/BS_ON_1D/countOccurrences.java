package binarySearch.BS_ON_1D;

public class countOccurrences {
     int countFreq(int[] arr, int target) {
        // code here
        int ans[] = firstAndLast(arr, target);
        if(ans[0] == -1) {
            return 0;
        }
        
        return (ans[1] - ans[0] + 1);
        
    }
    
    int first(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1, first = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return first;
    }
    
    int last(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1, last = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return last;
    }
    
    int[] firstAndLast(int arr[], int target) {
        int first = first(arr, target);
        if(first == -1) {
            return new int[] {-1, -1};
        }
        int last = last(arr, target);
        
        return new int[] {first, last};
    }
}
