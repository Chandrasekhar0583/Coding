class Solution {
    int countWays(int n) {
        // your code here
        if(n < 0 ) return 0;
        if(n == 1 || n== 2) return n;
        
        int a = 1;
        int b = 2;
        n -= 2;
        while(n -- > 0){
            int x = a + b;
            a = b;
            b = x;
        }
        return b ;
    }
}
