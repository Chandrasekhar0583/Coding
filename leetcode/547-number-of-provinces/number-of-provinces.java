class Solution {
    public int findCircleNum(int[][] arr) {
        int n = arr.length;
        int count = 0;
        boolean visited[] = new boolean[n];
        for(int i = 0 ; i < n ; i++){
                if(!visited[i]){
                    dfs( i, visited , arr);
                    count++;
                }
        }
        return count;
    }
    public void dfs(int i , boolean visited[] , int[][] arr){
       visited[i] = true;
       for(int j = 0 ; j < visited.length ; j++ ){
        if(!visited[j] && arr[i][j] == 1){
            dfs(j , visited , arr);
        }
       }
    }
}