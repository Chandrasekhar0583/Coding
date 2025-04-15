class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> res = new ArrayList<>();
        int num1 = 0 ,num2 = 0;
        while( num != 0)
        {
            res.add( num % 10);
            num = num / 10;
        }
        Collections.sort(res);
        for ( int i = 0 ;i < res.size() ; i++ )
        {
            if( i % 2 ==0)
            {
                num1 = num1 * 10 + res.get(i);
            }
            else{
                num2 = num2 * 10 + res.get(i);
            }
        }
        return num1 + num2 ;
    }
}