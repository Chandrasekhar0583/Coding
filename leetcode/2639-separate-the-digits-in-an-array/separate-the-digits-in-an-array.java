class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            String s = ""+i;
            for(char ch : s.toCharArray()){
                list.add(Integer.parseInt(""+ch));
            }
        }
        int len = list.size();
        int arr[] = new int[len];
        for(int i = 0 ; i < len ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}