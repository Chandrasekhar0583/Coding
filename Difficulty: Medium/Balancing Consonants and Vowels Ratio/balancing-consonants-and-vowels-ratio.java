class Solution {
    public int countBalanced(String[] arr) {
        // code here
        HashMap<Integer , Integer> map1 = new HashMap<>();
        int res = 0;
        int ovel = 0 , consonent = 0;
        for(String s : arr)
        {
                for(char ch : s.toCharArray())
                {
                    if("aeiou".contains(""+ch))
                    ovel++;
                    else
                    consonent++;
                }
                int x = ovel - consonent;
                if(x == 0)
                res++;
                if(map1.containsKey(x))
                {
                    res += map1.get(x) ;
                }
                // System.out.println(ovel +" "+consonent +" "+res);
                map1.put(x , map1.getOrDefault( x , 0 )+1);
        }
        return res;
    }
}