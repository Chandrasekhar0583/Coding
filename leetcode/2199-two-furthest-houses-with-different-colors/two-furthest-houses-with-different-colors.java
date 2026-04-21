class Solution {
    public int maxDistance(int[] arr) {
        int res = -1;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j< arr.length ; j++){
                if(arr[i] != arr[j]){
                    res = Math.max(res , j - i);
                }
            }
        }
        return res;
    }
}