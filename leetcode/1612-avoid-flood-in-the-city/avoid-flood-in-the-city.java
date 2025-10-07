class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = rains[i];
            if (num == 0) {
                list.add(i);
            } else {
                if (map.containsKey(num)) {
                    int v = map.get(num);
                    if (list.size() > 0) {
                        boolean flag = false;
                        int ind = find(list , v);
                        // System.out.println(ind +" "+ num);
                        if(ind != -1)
                        {
                            res[list.get(ind)] = num;
                            map.put(num , i);
                            list.remove(ind);
                        }
                        else
                            return new int[0];
                    } else {
                        return new int[0];
                    }
                } else {
                    map.put(num, i);
                }
            }
        }
        for(int i : list)
        {
            res[i] = 1;
        }
        return res;
    }
    public int find(ArrayList<Integer> list , int ind)
    {
        int low = 0 , high = list.size() - 1;
        int res = -1;
        while(low <= high)
        {
            int mid = (low + high) /2;
            int x = list.get(mid);
            if(ind < x)
            {
                high = mid - 1;
                res = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
}