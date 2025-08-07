class Solution {
    public int minDifference(String[] arr) {
        // code here
        Arrays.sort(arr);
        long first = 0L,last = 0L;
        int res = Integer.MAX_VALUE;
        long prev = 0L;
        first += Long.parseLong(arr[0].substring(0,2)) * 3600;
        first += Long.parseLong(arr[0].substring(3,5)) * 60;
        first += Long.parseLong(arr[0].substring(6)) ;
        prev = first;
        for(int i = 1 ; i < arr.length ;i++)
        {
            last = 0L;
        last += Long.parseLong(arr[i].substring(0,2)) * 3600;
        last += Long.parseLong(arr[i].substring(3,5)) * 60;
        last += Long.parseLong(arr[i].substring(6)) ;
           res = (int)(Math.min(res ,(int) last - prev));
           if(i == arr.length - 1)
           res = (int)Math.min(res ,(int) (86400 - last + first));
           prev = last;
        }
        // System.out.println(prev +" "+first);
        return res;
    }
}
