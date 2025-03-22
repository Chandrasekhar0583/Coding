class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        int i = 0;
        while(i<32)
        {
         
            if(i%2==0)
            {
                arr[0] += ((1<<i)&n)==0?0:1;
            }
            else{
                arr[1] += ((1<<i)&n)==0?0:1;
            }
            i++;
        }
        return arr;
    }
}