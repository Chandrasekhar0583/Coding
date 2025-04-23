class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 1 ; i <= n ; i++)
        {
            int sum = 0;
            int x = i;
            while(x > 0)
            {
                sum += x % 10;
                x = x / 10;
            }
            map.put( sum , map.getOrDefault( sum , 0) + 1);
        }
        ArrayList<Map.Entry<Integer , Integer >> list = new ArrayList<>(map.entrySet());
        list.sort( (n1,n2) -> n2.getValue() - n1.getValue());
        int count = 0;
        int x = -1;
        for(Map.Entry<Integer , Integer > m : list)
        {
            if(x == -1)
            {
                x = m.getValue();
            }
            if( x != m.getValue())
            break;
            count++;
        }
        return count;
    }
}