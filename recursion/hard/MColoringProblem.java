package recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MColoringProblem {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        List<Integer>[] adj = new ArrayList[v];
        for(int i=0; i<v; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for(int[] it: edges) {
            adj[it[0]].add(it[1]);
            adj[it[1]].add(it[0]);
        }
        
        int color[] = new int[v];
        Arrays.fill(color, -1);
        return cancolor(0, m, adj, color);
    }
    
    boolean cancolor(int vertex, int m, List<Integer>[] adj, int[] color) {
        if(vertex == color.length) {
            return true;
        }
        
        for(int i=0; i<m; i++) {
            if(isSafe(vertex, i, adj, color)) {
                color[vertex] = i;
                if(cancolor(vertex + 1, m, adj, color)) {
                    return true;
                }
                color[vertex] = -1;
            }
            
        }
        return false;
    }
    
    boolean isSafe(int vertex, int col, List<Integer>[] adj, int[] color) {
        for(int it: adj[vertex]) {
            if(color[it] != -1 && col  == color[it]) {
                return false;
            }
        }
        return true;
    }
}
