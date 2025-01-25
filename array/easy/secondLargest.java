package array.easy;

public class secondLargest {
      // Function returns the second
      // largest elements
      public int getSecondLargest(int []arr) {
          // Code Here
          int max = -1;
          int sec_max = -1;
          int n = arr.length;
          for(int i=0; i<n; i++) {
              if(arr[i] > max) {
                  sec_max = max;
                  max = arr[i];
              }
              else if(arr[i] > sec_max && arr[i] != max) {
                      sec_max = arr[i];
                  }
          }
          return sec_max;
      }
}
