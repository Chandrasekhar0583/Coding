public class Solution {
    public int reverseBits(int n) {
        long output=0;
        int t=0;
        while(t<32)
        {
            int x= (n>>t)&1;
             output=output | (x<<(31-t));
            t++;
        }
        return (int)output;
    }
}