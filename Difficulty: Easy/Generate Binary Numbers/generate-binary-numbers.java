class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        Queue<String> q = new ArrayDeque<>();
        ArrayList<String> res = new ArrayList<>();
        q.add("1");
        while(res.size() < n)
        {
                String s = q.poll();
                res.add(s);
                q.add(s+"0");
                q.add(s+"1");

        }
        return res;
    }
}
