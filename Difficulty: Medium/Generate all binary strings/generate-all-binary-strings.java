class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
      
        ArrayList<String> list = new ArrayList<>();
        int total = 1 << n;
        StringBuilder res = new StringBuilder();
        find(res , n , list);
        return list;
    }
    public void find(StringBuilder sb , int n , ArrayList<String> list)
    {
        if(sb.length() == n) {
            list.add(sb.toString());
            return ;}
        
        sb.append("0");
        find(sb ,  n , list);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        find(sb ,  n , list);
        sb.deleteCharAt(sb.length() - 1);
        return ;
    }
}
