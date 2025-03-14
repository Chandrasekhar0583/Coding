class Solution {
    public int maximumCandies(int[] candies, long k) {
        int high = candies[0];
        int len = candies.length;
        for(int i =1;i<len ;i++)
        {
         high = Math.max(candies[i],high);
        }
        int low = 1;
        int ans=0;
        while(low<=high)
        {
            int mid =(low+high)/2;
            if(canDist(candies,mid,k))
            {
                ans = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean canDist(int[] arr , int key,long k)
    {
        long total = 0;
        for(int i:arr)
        {
            total += i/key;
        }
        return total>=k;
    }
}