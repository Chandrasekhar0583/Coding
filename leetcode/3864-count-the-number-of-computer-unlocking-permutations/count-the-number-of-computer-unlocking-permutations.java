class Solution {
    public int countPermutations(int[] com) {
        int res = 0;
        int x = com[0];
        Arrays.sort(com);
        if(com[1] <= x) return 0;
        long fact = 1;
        for(int i = com.length - 1 ; i >= 1 ; i--)
        {
            fact = (fact * i) % 1000000007;
        }

        return (int)fact;
    }
}