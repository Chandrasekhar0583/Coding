class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int r = grid[0][0]%x;
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                int l = grid[i][j];
                list.add(l);
                if(l%x!=r)
                return -1;
            }
        }
        Collections.sort(list,new Mycmp());
        int len = m*n;
        int med =-1;
        med = list.get(len/2);
        System.out.println(med);
        int count =0;
        for(Integer i :list)
        {
            count += Math.abs(i-med)/x;
        }
        return count;
    }
}
class Mycmp implements Comparator<Integer>{
    public int compare(Integer n1,Integer n2)
    {
        return n1-n2;
    }

}