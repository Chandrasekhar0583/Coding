class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int arr[] = new int[n];
        Arrays.fill(arr , -1);
        for(int i = 0 ; i < n ; i++){
            boolean flag = false;
            int x = nums.get(i);
            // System.out.print(x+" ->");
            for(int j = 32 ; j >= 0 ; j--){
                if((x & (1 << j) ) >= 1){
                    int y = (x ^ (1 << j));
                    if( (y | (y + 1)) == x){
                        // System.out.print(y +" ");
                        if(arr[i] == -1)
                        arr[i] = y;
                        else{
                            arr[i] = Math.min(arr[i] , y);
                        }
                    }
                }
            }
            // System.out.println();
            }
        return arr;
        }

}