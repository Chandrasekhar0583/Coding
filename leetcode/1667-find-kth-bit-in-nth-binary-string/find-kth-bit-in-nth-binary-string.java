class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        for(int i = 1; i < n; i++) {
            s.append('1');
            for(int j = s.length() - 2; j >= 0; j--) {
                char invert = s.charAt(j) == '0'? '1': '0';
                s.append(invert);
            }
        }
        return s.charAt(k-1);
    }
}