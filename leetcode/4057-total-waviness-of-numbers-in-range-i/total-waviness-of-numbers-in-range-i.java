class Solution {
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for(int i = num1 ; i <= num2 ; i++)
        {
            String s = "" + i;
            for(int j = 1 ; j < s.length() - 1 ; j++)
            {
                int x = s.charAt(j - 1);
                int y = s.charAt(j );
                int z = s.charAt(j + 1);
                if(x < y && z < y) res++;
                else if(x > y && z > y) res++;
            }
        }
        return res;
    }
}