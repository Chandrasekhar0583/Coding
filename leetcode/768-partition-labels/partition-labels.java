class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int n = s.length();
        int len =-1;
        while(i<n)
        {
            int resultIndex = s.lastIndexOf(s.charAt(i));
            while(i<resultIndex)
            {
                i++;
             resultIndex = Math.max(resultIndex,s.lastIndexOf(s.charAt(i)));
            }
            res.add(resultIndex-len);
            i = resultIndex+1;
            len = resultIndex;

        }
        return res;
    }
}