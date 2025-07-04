package recursion.hard;

import java.util.ArrayList;

public class ratInAMaze {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;
        
        int vis[][] = new int[n][n];
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                vis[i][j] = 0;
            }
        }
        
        int di[] = {1, 0, 0, -1};
        int dj[] = {0, -1, 1, 0};
        
        ArrayList<String> res = new ArrayList<>();
        if(maze[0][0] == 1)
        solve(0, 0, maze, n, res, "", vis, di, dj);
        return res;
        
    }
    
    private void solve(int i, int j, int[][] maze, int n, ArrayList<String> res, String s, int[][] vis, int di[], int dj[]) {
        if(i == n-1 && j == n-1) {
            res.add(s);
            return;
        }
        
        String dir = "DLRU";
        
        for(int ind = 0; ind<4; ind++) {
            int nexti = i + di[ind];
            int nextj = j + dj[ind];
            
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && maze[nexti][nextj] == 1) {
                vis[i][j] = 1;
                solve(nexti, nextj, maze, n, res, s + dir.charAt(ind), vis, di, dj);
                vis[i][j] = 0;
            }
        }
    }
}
