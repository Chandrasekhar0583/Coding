class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        // code here
        PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<int[]>(){
            
            public int compare(int a[] , int b[])
            {
                return a[0] - b[0];
            }
        });
        ArrayList<ArrayList<Integer>>  res = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        Set<String> set = new HashSet<>();
        set.add("0,0");
        pq.add(new int[]{arr1[0] + arr2[0] , 0 , 0});
        while(k > 0 && !pq.isEmpty())
        {
            int arr[] = pq.poll();
            int i = arr[1];
            int j = arr[2];
            
            res.add(new ArrayList<>(Arrays.asList(arr1[i] , arr2[j])));
            k--;
            
            if(i + 1 < n)
            {
                String s2 = (i + 1) +","+j;
                if(!set.contains(s2))
                {
                    pq.add(new int[]{arr1[i + 1] + arr2[j] , i + 1, j});
                    set.add(s2);
                }
            }
            if(j + 1 < m)
            {
                String s2 = (i) +","+(j + 1);
                if(!set.contains(s2))
                {
                    pq.add(new int[]{arr1[i] + arr2[j + 1] , i , j+1});
                    set.add(s2);
                }
            }
        }
        return res;
    }
}
