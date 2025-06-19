// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr)
        {
            map.put(i , map.getOrDefault( i , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> m : map.entrySet())
        {
            if( m.getValue() == 1)
            {
                return m.getKey();
            }
        }
        return 0;
    }
}
