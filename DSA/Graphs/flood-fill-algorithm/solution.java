import java.util.*;

class Pair {
    int row, col;
    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public static void bfs(int sr, int sc, Queue<Pair> q, int[][] result, int newColor, int originalColor) {
        int n = result.length;
        int m = result[0].length;

        q.add(new Pair(sr, sc));
        result[sr][sc] = newColor;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair node = q.remove();
            int r = node.row;
            int c = node.col;

            for (int i = 0; i < 4; i++) {
                int delRow = r + dr[i];
                int delCol = c + dc[i];

                if (delRow >= 0 && delRow < n && delCol >= 0 && delCol < m
                        && result[delRow][delCol] == originalColor) {
                    result[delRow][delCol] = newColor;
                    q.add(new Pair(delRow, delCol));
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;

        int originalColor = image[sr][sc];
        if (originalColor == newColor) return image; 
        
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                result[i][j] = image[i][j];

        Queue<Pair> q = new LinkedList<>();
        bfs(sr, sc, q, result, newColor, originalColor);
        return result;
    }
}