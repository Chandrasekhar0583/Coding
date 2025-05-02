class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score , new Comparator<int[]>(){
            @Override
            public int compare(int r1[] , int r2[])
            {
                return Integer.compare(r2[k] , r1[k]);
            }
        });
        return score;
    }
}