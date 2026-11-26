


class Solution {

    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        m = heights.length;
        n = heights[0].length;

        boolean[][] p = new boolean[m][n];
        boolean[][] a = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, p, i, 0);
            dfs(heights, a, i, n - 1);
        }

        for (int j = 0; j < n; j++) {
            dfs(heights, p, 0, j);
            dfs(heights, a, m - 1, j);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (p[i][j] && a[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    void dfs(int[][] h, boolean[][] visited, int r, int c) {

        if (r < 0 || c < 0 || r >= m || c >= n)
            return;

        if (visited[r][c])
            return;

        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nc >= 0 && nr < m && nc < n
                && !visited[nr][nc]
                && h[nr][nc] >= h[r][c]) {

                dfs(h, visited, nr, nc);
            }
        }
    }
}
