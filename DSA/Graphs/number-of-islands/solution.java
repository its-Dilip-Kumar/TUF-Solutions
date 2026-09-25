import java.util.*;

class Pair {
    int row, col;
    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public static void bfs(int row, int col, Queue<Pair> q,
                           boolean[][] visited, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        q.add(new Pair(row, col));
        visited[row][col] = true;

        int[] dr = {-1, -1, -1,  0, 0,  1, 1, 1};
int[] dc = {-1,  0,  1, -1, 1, -1, 0, 1};

        while (!q.isEmpty()) {
            Pair node = q.remove();
            int r = node.row;
            int c = node.col;

            for (int i = 0; i < 8; i++) {
                int newrow = r + dr[i];
                int newcol = c + dc[i];

                if (newrow >= 0 && newrow < n &&
                    newcol >= 0 && newcol < m &&
                    grid[newrow][newcol] == '1' &&
                    !visited[newrow][newcol]) {

                    visited[newrow][newcol] = true;
                    q.add(new Pair(newrow, newcol));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfs(i, j, q, visited, grid);
                }
            }
        }
        return count;
    }
}