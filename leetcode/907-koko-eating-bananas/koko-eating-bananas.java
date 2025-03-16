class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high =-1;
        // int sum =0;
        for(int i:piles)
        {
            high = Math.max(high,i);
            // sum += i;
        }
        int res =0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(can(piles,mid,h))
            {
                res = mid;
                high= mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    public static boolean can(int[] piles,int key, int h)
    {
      long count = 0;
      for(int i : piles)
      {
        if(i<key)
        count++;
        else if(i%key ==0)
        count += i/key;
        else
        count += i/key +1;
      }
      return count<=h;
    }
}