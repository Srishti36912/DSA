package sorting;
class insertion{
    void insert(int arr[], int i)
    {
        // Your code here 
        int temp = 0;
        for(int j = i-1; j>=0 ; j--) {
            if(arr[i] < arr[j]) {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            temp = 0;
            i--;
        }
                
        
    }
    //Function to sort the array using insertion sort algorithm.
    void insertionSort(int arr[], int n)
    {
        for(int i=0; i<n; i++) {
            
          insert(arr,i);  
                    
        }
    }
}