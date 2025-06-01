class Solution {
    public int snakesAndLadders(int[][] board) {
        int count = 0;
        int n = board.length;
        HashMap<Integer, Integer> adj = new HashMap<>();
        adjacentList(board, adj);
        int visited[] = new int[n * n];
        return solution(0, adj, visited);
    }

    public int solution(int ind, HashMap<Integer, Integer> adj, int visited[]) {
        Queue<int[]> que = new LinkedList<>();
        visited[ind] = 1;
        int n = visited.length;
        que.add(new int[] { 0, 0 });
        while (!que.isEmpty()) {
            int cur[] = que.poll();
            int pos = cur[0];
            int move = cur[1];
            if (pos == (n) - 1)
                return move;
            for (int i = 1; i <= 6; i++) {
                int next = pos + i;
                if (next >= n)
                    continue;
                if (visited[next] == 1)
                    continue;
                visited[next] = 1;
                int dis = 0;
                if (adj.containsKey(next)) {
                    dis = adj.get(next);
                } else {
                    dis = next;
                }
                que.add(new int[] { dis, move + 1 });

            }
        }
        return -1;

    }
     public void adjacentList(int[][] board, HashMap<Integer, Integer> adj) {
        int n = board.length;
        int idx = 0;
        boolean leftToRight = true;
        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] != -1)
                        adj.put(idx, board[i][j] - 1);
                    idx++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (board[i][j] != -1)
                        adj.put(idx, board[i][j] - 1);
                    idx++;
                }
            }
            leftToRight = !leftToRight;
        }
    }
   

    
}