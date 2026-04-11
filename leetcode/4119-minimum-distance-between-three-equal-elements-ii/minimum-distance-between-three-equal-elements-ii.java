class Solution {
    public int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);

        }
        for (List<Integer> li : map.values()) {
            if (li.size() < 3)
                continue;

            for (int i = 1; i < li.size() - 1; i++) {
                int dis = (2 * li.get(i + 1)) - (2 * li.get(i - 1));
                res = Math.min(res, dis);
            }
        }
        return res != Integer.MAX_VALUE ? res : -1;
    }
}