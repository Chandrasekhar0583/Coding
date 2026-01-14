class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<Character> a=Arrays.asList('I','V','X','L','C','D','M');
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        char[] cr=s.toCharArray();
        for (int i=0;i<cr.length;i++){
            if((cr[i]=='I' || cr[i]=='X' ||cr[i]=='C')&& i!=cr.length-1)
            {
                int j = a.indexOf(cr[i]);
                if(cr[i+1]==a.get(j+1) || cr[i+1]==a.get(j+2))
                {
                   
                   sum+= map.get(cr[i+1])-map.get(cr[i]);
                    i++;
                }
                else
                sum+=map.get(cr[i]);
            }
            else
            sum+=map.get(cr[i]);
        }
        return sum;

    }
}