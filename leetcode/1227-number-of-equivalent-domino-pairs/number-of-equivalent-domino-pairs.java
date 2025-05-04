class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        int c = 0;
        for(int a[] : dominoes)
        {
            ArrayList<Integer> b = new ArrayList<>();
            b.add(Math.min(a[0],a[1]));
            b.add(Math.max(a[0],a[1]));
            map.put(b , map.getOrDefault(b , 0) + 1);
        }
        System.out.println(map);
        for(Integer val : map.values())
        {
            if(val > 1)
            {
                c += val * (val - 1) / 2;
            }
        }
        return c ;
    }
}