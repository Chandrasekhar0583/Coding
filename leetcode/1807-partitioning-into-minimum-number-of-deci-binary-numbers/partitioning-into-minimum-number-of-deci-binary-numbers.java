class Solution {
    public int minPartitions(String n) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        int len = n.length();
        while( i < len )
        {
            int x = n.charAt(i) - '0';
           max = Math.max( x , max);
           i++;
        }
     return max;   
    }
}