class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        for(String i : strs)
        {
            char arr[] = i.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
           List<String> l = map.getOrDefault( s, new ArrayList<>());
           l.add(i);
           map.put(s , l);
        }
        for(List<String> l : map.values())
        {
            list.add(l);
        }
        return list;
    }
}