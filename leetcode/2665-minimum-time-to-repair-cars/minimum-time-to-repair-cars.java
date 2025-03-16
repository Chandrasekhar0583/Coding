class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long high = -1;
        for(int i : ranks)
        {
            high = Math.max(high, i);
        }
        high = high * cars *cars;
        long res = 0;
        while(low<=high)
        {
            long mid = (low+high)/2;
            if(can( ranks , mid ,  cars))
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public boolean can(int[] ranks,long key , int cars )
    {
        int count=0;
        for(int i : ranks)
        {
            count += Math.sqrt((key)/i);
        }
        return count>=cars;
    }
}