// User function Template for Java
class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        int x = n % 7;
        if(x <= d)
        return d - x;
        else
        return 6 - (x - d) + 1;
        
    }
}