class Solution {
    public int totalNumbers(int[] digits) {
       int n = digits.length;
       boolean vis[] = new boolean[n];
       Arrays.sort(digits);
       StringBuilder sb = new StringBuilder();
       return find(digits , vis ,  sb);
    }
    public int find(int[] arr , boolean[] vis , StringBuilder sb)
    {
        if(sb.length() == 3)
        {
            int x = sb.charAt(2) - '0';
            return x % 2 == 0 ? 1 : 0;
        }
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(vis[i]) continue;
            if(i > 0 && arr[i] == arr[i - 1] && !vis[i - 1]) continue;
            if(sb.length() == 0 && arr[i] == 0) continue;
            vis[i] = true;
            count += find(arr , vis , sb.append(arr[i]));
            sb.deleteCharAt(sb.length() - 1);
            vis[i] = false;
        }
        return count;
    }
}