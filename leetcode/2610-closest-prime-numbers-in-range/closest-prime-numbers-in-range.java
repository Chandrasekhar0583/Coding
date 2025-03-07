class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean isPrime[] = new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2 ; i*i<=right ;i++)
        {
            if(isPrime[i])
            for(int j = i*i ; j<=right ;j+=i)
            {
                isPrime[j] = false;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] = new int[2];
        for(int i=left ; i<=right ;i++)
        {
            if(isPrime[i])
            res.add(i);
        }
        int min = right;
        for(int i=1;i<res.size();i++)
        {
            if(res.get(i)-res.get(i-1)<min)
            {
                arr[0] = res.get(i-1);
                arr[1] = res.get(i);
                min = arr[1]-arr[0];
            }
        }
        if(min==right)
        {
            arr[0] =-1;arr[1]=-1;
        }
        return arr;
    }
}