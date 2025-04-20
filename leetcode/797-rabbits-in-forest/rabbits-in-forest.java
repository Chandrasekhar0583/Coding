class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int  i : answers)
            map.put( i , map.getOrDefault( i , 0) + 1);
        int res = 0;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            int x = m.getKey() + 1;
            int y = m.getValue() / x;
            int z = m.getValue() % x;
            y += z > 0 ? 1 : 0 ;
            res += y * x;
        }
        return res;
    }
}