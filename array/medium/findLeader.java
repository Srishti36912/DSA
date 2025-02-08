package array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class findLeader {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
        leader.add(arr[n-1]);
        int max = arr[n-1];
        
        for(int i=n-2; i>=0; i--) {
            if(arr[i] >= max) {
                leader.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(leader, Collections.reverseOrder());
        return leader;
    }
}
