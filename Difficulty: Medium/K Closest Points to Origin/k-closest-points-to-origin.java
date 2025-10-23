class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        TreeMap<Double , ArrayList<ArrayList<Integer>> > map = new TreeMap<>();
        for(int a[] : points)
        {
            double d =  Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            map.putIfAbsent(d ,new ArrayList<ArrayList<Integer>> ());
            ArrayList<Integer> li = new ArrayList<>();
            li.add(a[0]);
            li.add(a[1]);
            ArrayList<ArrayList<Integer>> r = map.get(d);
            r.add(li);
            map.put(d , r);
        }
        while(res.size() < k)
        {
            for(ArrayList<ArrayList<Integer>> li : map.values())
            {
                for(ArrayList<Integer> l : li){
                res.add(l);
                    if(res.size() == k) break;
                }
                    if(res.size() == k) break;
            }
        }
        return res;
    }
}