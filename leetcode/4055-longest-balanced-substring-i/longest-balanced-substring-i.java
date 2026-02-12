class Solution {
    public int longestBalanced(String s) {
        int maxRes = 0;
        for(int i = 0 ; i < s.length() ; i++)
            {
               int freq[] = new int[26];
                int dis = 0;
                for(int j = i ; j < s.length() ; j++)
                    {
                        int ind = s.charAt(j) - 'a' ;
                        if(freq[ind] == 0) dis++;
                        freq[ind]++;
                            int min = Integer.MAX_VALUE;
                            int max = Integer.MIN_VALUE;
                            for(int k : freq)
                                {
                                    if(k > 0){
                                    min = Math.min(k , min);
                                    max = Math.max(k , max);
                                    }
                                }
                            
                            if(dis > 0 &&min == max)
                            {
                                maxRes = Math.max(maxRes , j - i + 1 );
                            }
                        
                    }
            }
        return maxRes;
    }
}