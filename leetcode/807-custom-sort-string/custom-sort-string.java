class Solution {
    public String customSortString(String order, String s) {
        int len = order.length();
        int n = s.length();
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int ind = order.indexOf(c);
            if (ind != -1) {
                if (map.containsKey(ind)) {
                    String r = map.get(ind);
                    r += c;
                    map.put(ind, r);
                } else
                    map.put(ind, "" + c);
            } else {
                map.put(len++, "" + c);
            }
        }
        String res = "";
        for (String ch : map.values()) {

            res += ch;
        }
        return res;
    }
}