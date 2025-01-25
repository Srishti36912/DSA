package array.easy;

import java.util.ArrayList;

public class union {
        // Function to return a list containing the union of the two arrays.
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            // add your code here
            ArrayList<Integer> arr = new ArrayList<>();
            int m = a.length;
            int n = b.length;
            int i=0,j=0;
            
            while(i<m && j<n) {
                if(a[i] <= b[j]) {
                    if(arr.size() == 0 || arr.get(arr.size()-1) != a[i]) {
                        arr.add(a[i]);
                    }
                        i++;
                } else {
                    if(arr.size() == 0 || arr.get(arr.size()-1) != b[j]) {
                    arr.add(b[j]);
                    }
                    j++;
                }
            }
            
            while(i<m) {
                if(arr.get(arr.size()-1) != a[i]) {
                    arr.add(a[i]);
                }
                    i++;
            }
            
            while(j<n) {
                if(arr.get(arr.size()-1) != b[j]) {
                    arr.add(b[j]);
                }
                    j++;
            }
            
            return arr;
        }
}
