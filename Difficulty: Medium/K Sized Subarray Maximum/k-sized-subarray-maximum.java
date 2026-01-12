

class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int i = 0;

        while (i < k) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            i++;
        }

        while (i < n) {
            res.add(arr[dq.peekFirst()]);
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
            i++;
        }

        res.add(arr[dq.peekFirst()]);
        return res;
    }
}
