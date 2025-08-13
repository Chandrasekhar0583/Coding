class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> small=new PriorityQueue<>();
        int total=arr.length;
        if(total%2!=0)
        {
        total=total/2;
        total++;
        }
        else
        {
            total=total/2;
        }
        // System.out.println(total);
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%k==0)
            total--;
            else
            {
                int rem=arr[i]%k;
                small.add(k-rem);
            }
        }
        if(total<=0)
        return 0;
        else
        {
            int min=0;
            while(total-->0)
            {
                min+=small.poll();
            }
               return min;
        }
     
    }
}