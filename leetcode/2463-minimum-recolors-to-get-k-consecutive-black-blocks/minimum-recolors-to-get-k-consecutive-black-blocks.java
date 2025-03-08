class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0;
        int black = 0;
         for(int i =0 ;i<k;i++)
         {
            if(blocks.charAt(i)=='W')
            white++;
            else
            black++;
         }
         if(black==k)
         return 0;
         int min=white;
         for(int i=0;i<blocks.length()-k;i++)
         {
           if(blocks.charAt(i)=='W')
           white--;
           else
           black--;
           if(blocks.charAt(i+k)=='W')
           white++;
           else
           black++;
           if(white<=min)
           min=white;
         }
         return min;
    }
}