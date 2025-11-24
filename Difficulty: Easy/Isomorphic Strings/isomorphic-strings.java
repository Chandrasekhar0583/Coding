class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        Arrays.fill(arr1 , -1);
        Arrays.fill(arr2 , -1);
        for(int i = 0 ; i < s1.length() ; i++ )
        {
            int x = s1.charAt(i) - 'a';
            int y = s2.charAt(i) - 'a';
            if(arr1[x] == -1 && arr2[y] == -1)
            {
                arr1[x] = y;
                arr2[y] = x;
            }
            else if(arr1[x] != y || arr2[y] != x) return false;
        }
        return true;
    }
}