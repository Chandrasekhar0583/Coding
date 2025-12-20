class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int arr[] = new int[n];
        int count = 0;

        for (String s : strs) {
            for (int i = 0; i < n; i++) {
                int ch = s.charAt(i) - 'a';
                if (arr[i] > ch) {
                    arr[i] = -1;
                    count++;
                }
                if (arr[i] != -1)
                    arr[i] = ch;
            }
        }
        return count;
    }
}