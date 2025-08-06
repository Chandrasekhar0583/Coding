class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for(int i = 0 ; i < n ; i++)
        {
            int low = 0;
            int high = m - 1;
            while(low < high)
            {
                int x = image[i][low];
                image[i][low] = image[i][high];
                image[i][high] = x;
                image[i][low] = image[i][low] == 0 ? 1 : 0;
                image[i][high] = image[i][high] == 0 ? 1 : 0;
                low++;
                high--;
            }
            if(low == high)
            {
                image[i][low] = image[i][low] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}