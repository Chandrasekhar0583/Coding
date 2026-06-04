class Solution {
    int n, m;

    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        n = arr.length;
        m = arr[0].length;
        boolean vis[][] = new boolean[n][m];
        bfs(arr, vis, sr, sc, color, arr[sr][sc]);
        return arr;
    }

    public void bfs(int arr[][], boolean vis[][], int r, int c, int replace, int original) {
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[] { r, c });
        arr[r][c] = replace;
        vis[r][c] = true;
        while (!que.isEmpty()) {
            int entry[] = que.poll();
            int x = entry[0];
            int y = entry[1];
            int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
            for (int d[] : dirs) {
                int nx = x + d[0];
                int ny = y + d[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == original && !vis[nx][ny]) {
                    arr[nx][ny] = replace;
                    vis[nx][ny] = true;
                    que.add(new int[] { nx, ny });
                }
            }
        }
    }

    public void dfs(int arr[][], boolean vis[][], int r, int c, int replace, int original) {
        if (r < 0 || r >= n || c < 0 || c >= m)
            return;
        if (vis[r][c])
            return;
        vis[r][c] = true;
        if (arr[r][c] != original)
            return;
        arr[r][c] = replace;

        dfs(arr, vis, r - 1, c, replace, original);
        dfs(arr, vis, r, c - 1, replace, original);

        dfs(arr, vis, r + 1, c, replace, original);
        dfs(arr, vis, r, c + 1, replace, original);
    }
}