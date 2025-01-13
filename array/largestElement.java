package array;

public class largestElement {
    // User function Template for C

// Function to check if the array is sorted
int largest(int arr[], int n) {
    // Code Here
    int max = arr[0];
    for(int i=1; i<n; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    
    return max;
}
}
