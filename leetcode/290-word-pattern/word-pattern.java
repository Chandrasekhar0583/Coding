class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length())
        return false;
        // Arrays.sort(arr);
        // pattern
        // for(String s1  : arr){
        // System.out.println(s1);
        // }
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> reversemap = new HashMap<>();
        for(int i = 0 ;i<arr.length ; i++)
        {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch))
            {
                if(!arr[i].equals(map.get(ch)))
                return false;
            }
            else{
                if(reversemap.containsKey(arr[i]))
                {
                    if(reversemap.get(arr[i])!=ch)
                    return false;
                }
                map.put(ch,arr[i]);
                reversemap.put(arr[i],ch);
            }
        }
        return true;
    }
}