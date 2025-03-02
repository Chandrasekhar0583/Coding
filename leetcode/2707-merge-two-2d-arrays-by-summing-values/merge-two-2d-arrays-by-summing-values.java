class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0,j = 0;
        while(i<n)
        {
            map.put(nums1[i][0],nums1[i][1]);
            i++;
        }
        while(j<m)
        {
            if(map.containsKey(nums2[j][0]))
            map.put(nums2[j][0],map.get(nums2[j][0])+nums2[j][1]);
            else
            map.put(nums2[j][0],nums2[j][1]);
            j++;
        }
        int[][] arr = new int[map.size()][2];
        i = 0;
        for(Map.Entry<Integer,Integer> m1 : map.entrySet())
        {
            arr[i][0] = m1.getKey();
            arr[i][1] = m1.getValue();
            i++;
        }
        return arr;
    }
}