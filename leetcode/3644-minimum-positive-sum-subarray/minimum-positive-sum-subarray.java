class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int s = check(nums, i);
            if (s > 0)
              res = Math.min(res,s);
        }
       return res!=Integer.MAX_VALUE?res : -1;
    }

    public int check(List<Integer> num, int k) {
        int n = num.size();
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < n ; i++) {
            sum += num.get(i);
            if (i + 1 >= k && sum > 0) {
               res = Math.min(res , sum);
            }
            if (i + 1 >= k) {
                sum -= num.get(j);
                j++;
            }
        }
        return res!=Integer.MAX_VALUE?res : -1;
    }
}