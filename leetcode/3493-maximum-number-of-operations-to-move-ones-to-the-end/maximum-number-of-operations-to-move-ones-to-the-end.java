class Solution {
    public int maxOperations(String s) {
        // return 7;

        int one = 0 ;
        boolean flag = false;

        int i = 0 ; 
        int n = s.length();

        int res = 0;

        while(i < n )
        {
            if(s.charAt(i) == '1'){
            one++;
            i++;
            }
            else{
                int j = i + 1;
                while(j < n && one > 0 && s.charAt(j) == '0')
                {
                    j++;
                }
                i = j ;
                res += one;
            }
        }
        return res;
    }
}