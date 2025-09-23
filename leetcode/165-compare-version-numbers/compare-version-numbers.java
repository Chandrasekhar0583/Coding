class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[] = version1.split("\\.");
        String arr2[] = version2.split("\\.");
        // System.out.println(Arrays.toString(arr1));
        int i = 0 , j =0;
        int n = arr1.length;
        int m = arr2.length;
        while(i < n && j < m)
        {
            int x = Integer.parseInt(arr1[i]);
            int y = Integer.parseInt(arr2[j]);
            if(x > y)
            return 1;
            else if(x < y)
            return -1;
            i++;
            j++;
        }
        while(i < n)
        {
            int x = Integer.parseInt(arr1[i]);
            int y = Integer.parseInt(arr2[j - 1]);
            i++;
            if(x == 0) continue;
            if(x > 0)
            return 1;
        }
        while(j < m)
        {
            int y = Integer.parseInt(arr2[j]);
            int x = Integer.parseInt(arr1[i - 1]);
            j++;
            if(y == 0) continue;
            else if(0 < y)
            return -1;
        }
        return 0;
    }
}