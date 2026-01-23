class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int arr[] = new int[n];
        Arrays.fill(arr , -1);
        for(int i = 0 ; i < n ; i++){
            boolean flag = false;
            for(int j= 0 ; j <= nums.get(i) ; j++){
                int x = (j | (j + 1)) ;
                if(x == nums.get(i)){

                    arr[i] = j;
                    break;
                }
            }
        }
        return arr;
    }
}