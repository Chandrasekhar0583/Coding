class Solution {
    public int smallestNumber(int n) {
        String s = Integer.toString(n , 2);
        String res = "";
        for(int i = 0 ; i < s.length() ; i++)
        {
            res += 1;
        }
        // System.out.println(s);
        return Integer.parseInt(res , 2);

    }
}