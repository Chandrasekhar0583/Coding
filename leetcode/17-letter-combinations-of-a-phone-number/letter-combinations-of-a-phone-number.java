class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        int n= digits.length();
        if(n==0)
        {
            return list;
        }
        Map<Character,String> map = Map.ofEntries(
        Map.entry('2',"abc"),
        Map.entry('3',"def"),
        Map.entry('4',"ghi"),
        Map.entry('5',"jkl"),
        Map.entry('6',"mno"),
        Map.entry('7',"pqrs"),
        Map.entry('8',"tuv"),
        Map.entry('9',"wxyz")
        );
        int i=0;
        String[] arr = new String[n];
        for(char ch : digits.toCharArray())
        {
            arr[i++] = map.get(ch);
        }
        i=0;
        for(int j=0;j<arr[i].length();j++)
        list.add(""+arr[i].charAt(j));
        for( i=1 ;i<n;i++)
        {
            String s = arr[i];
            ArrayList<String> l = new ArrayList<>();
            for(String s1 : list)
            {
                for(int k=0;k<s.length();k++)
                {

                l.add(s1+s.charAt(k));
                }
            }
            list.clear();
            list.addAll(l);
        }
        return list;
    }
}