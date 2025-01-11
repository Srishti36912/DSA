public class recursiveInsertionSort {
    

/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */


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
       }
               
       
   }
   //Function to sort the array using insertion sort algorithm.
   void insertionSort(int arr[], int n)
   {
       //code here
        if(n == 0) {
            return;
        }
         insert(arr,n-1);
         insertionSort(arr,n-1);
   }



}
