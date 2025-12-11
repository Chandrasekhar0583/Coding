class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer, int[] > row = new HashMap<>();
        HashMap<Integer, int[] > col = new HashMap<>();
        for(int a[] : buildings)
        {
            if(!row.containsKey(a[1]))
            {
                int arr[] = new int[]{Integer.MAX_VALUE , Integer.MIN_VALUE};
                row.put(a[1] , arr);
            }
            if(!col.containsKey(a[0]))
            {
                int arr[] = new int[]{Integer.MAX_VALUE , Integer.MIN_VALUE};
                col.put(a[0] , arr);
            }
            int r[] = row.get(a[1]);
            int c[] = col.get(a[0]);

            r[0] = Math.min(r[0] , a[0]);
            r[1] = Math.max(r[1] , a[0]);
            c[0] = Math.min(c[0] , a[1]);
            c[1] = Math.max(c[1] , a[1]);

            row.put(a[1] , r);

            col.put(a[0] , c);

        }
        int res = 0;

        for(int a[] : buildings)
        {
            int r[] = row.get(a[1]);
            int c[] = col.get(a[0]);

            if(r[0] < a[0] && a[0] < r[1])
            {
                if(c[0] < a[1] && a[1] < c[1]) res++;
            }
        }
        return res;
    }
    public boolean fun(ArrayList<Integer> list , int x)
    {
        int res = -1;
        int low = 0;
        int high = list.size() - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(list.get(mid) == x)
            {
                return mid == 0 || mid == list.size() - 1 ? false : true;
            }
            else if(list.get(mid) < x)
            {
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
}