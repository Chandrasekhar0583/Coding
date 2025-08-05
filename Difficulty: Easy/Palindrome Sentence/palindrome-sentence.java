class Solution {
    public boolean isPalinSent(String s) {
        // code here
        int i = 0 ;
        int n = s.length();
        int j = n - 1;
        String res = s.toUpperCase();
        while(i < j)
        {
            while(i < j && !Character.isLetterOrDigit(res.charAt(i)))
            i++;
            while(i < j && !Character.isLetterOrDigit(res.charAt(j)))
            j--;
            if(res.charAt(i) != res.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}