class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0 ;
        int j = 0;
        int res = 0;
        while(j < m && i < n){
            while(i <= j && i < n && nums1[i] > nums2[j] ){
                i++;
            }
            if(i <= j && i < n && nums1[i] <= nums2[j]){
                res = Math.max(j - i , res);
            }
            j++;
        }
        return res;
    }
}