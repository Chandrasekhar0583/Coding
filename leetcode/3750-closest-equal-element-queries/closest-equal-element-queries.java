class Solution {
    int n;

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<Integer>());
            }
            ArrayList<Integer> l = map.get(nums[i]);
            l.add(i);
            map.put(nums[i], l);

        }
        for (int i = 0; i < queries.length; i++) {
            list.add(search(map.get(nums[queries[i]]), queries[i]));
        }
        return list;
    }

    public int search(ArrayList<Integer> list, int key) {
        if (list.size() == 1)
            return -1;
        int ans = -1;
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) == key) {
                ans = mid;
                break;
            } else if (list.get(mid) > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int size = list.size();

        int next = list.get((ans + 1) % size);

        int prev = list.get((ans - 1 + size) % size);

        int distNext = (next - key + n) % n;
        int distPrev = (key - prev + n) % n;

        return Math.min(distNext, distPrev);
    }
}