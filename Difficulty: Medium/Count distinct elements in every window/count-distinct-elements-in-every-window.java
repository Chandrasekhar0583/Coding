class Solution {
    ArrayList<Integer> countDistinct(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        int[] freq = new int[100001]; // value constraint
        int distinct = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (freq[arr[i]] == 0) distinct++;
            freq[arr[i]]++;
        }
        res.add(distinct);

        // Sliding window
        for (int i = k; i < n; i++) {
            // Remove left
            freq[arr[i - k]]--;
            if (freq[arr[i - k]] == 0) distinct--;

            // Add right
            if (freq[arr[i]] == 0) distinct++;
            freq[arr[i]]++;

            res.add(distinct);
        }
        return res;
    }
}
