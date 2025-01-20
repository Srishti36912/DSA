package array;

import java.util.ArrayList;

public class union {
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                if(a[i] <= b[i]) {
                    if(arr.size() == 0 || arr.get(arr.size()-1)) {
                    arr.add(a[i]);
                    } else {
                        arr.add(b[i])
                    }
                    
                }
            }
        }
        return arr;
    }
}
