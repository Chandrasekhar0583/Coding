


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int low=0,right=0, sum=0;
        while(right<arr.length)
        {
                sum+=arr[right++];
                // System.out.println(sum);
            while(sum>target)
            {
                sum=sum-arr[low++];
            }
            if(sum==target)
            {
                res.add(low+1);
                res.add(right);
                break;
            }
        }
        if(res.size()==0)
        {
            res.add(-1);
        }
        
        return res;
    }
}
