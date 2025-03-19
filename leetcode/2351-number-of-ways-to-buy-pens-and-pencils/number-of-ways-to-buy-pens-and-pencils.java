class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long res = 0;
        if(total<cost1 && total<cost2)
        return 1;
        int i=0;
        while(i*cost1 <=total)
        {
            int t = total-(i*cost1);
            res += t/cost2+1;
            i++;
        }
        return res;
    }
}