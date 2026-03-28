class Solution {
    public int countDigits(int num) {
        int count = 0 ; 
        int x = num ;
        while(x > 0){
            int r = x % 10;
            count += num % r == 0 ? 1 : 0;
            x /= 10;
        }
        return count;
    }
}