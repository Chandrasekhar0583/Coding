class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0 ;
        int n = arr.length ;
        for( int i = 0 ; i <  n ; i++ )
        {
            int s = 0;
            for( int j = i ; j < n ; j++ )
            {
                s += arr[j] ; 
                if( (j - i ) % 2 == 0 ){
                sum += s;
                System.out.println(s);
                }
            }
        }
        return sum;
    }
}