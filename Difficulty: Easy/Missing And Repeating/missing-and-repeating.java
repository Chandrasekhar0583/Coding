class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int repeating = -1;
        for (int x : arr) {
            if (set.contains(x)) repeating = x;
            set.add(x);
        }

        int missing = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        res.add(repeating);
        res.add(missing);
        return res;
    }
}
