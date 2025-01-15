package sorting;
public class RecursiveBubbleSort {
    //User function Template for C


    //Function to sort the array using bubble sort algorithm.
    void bubbleSort(int arr[], int n)
    {
        // Your code here 
        if(n == 0) {
            return;
        }
        for(int j=0; j<n-1; j++) {
        if(arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }   
        }
        
        bubbleSort(arr,n-1);
    }
}
