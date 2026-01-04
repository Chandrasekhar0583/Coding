class Solution {
    int sum ;
    public int sumFourDivisors(int[] nums) {
        sum = 0;
        for(int i : nums){
            fun(i);
        }
        return sum;
    }
    public void fun(int x){
        HashSet<Integer> list = new HashSet<>();
        int s1 = 0;
        for(int i = 2 ; i * i <= x ; i++){
            if(x % i == 0){
                int y = x / i;
                list.add(i);
                list.add(y);
                if(x != y)
                s1+=y;
                s1 += i;
            }
            if(list.size() > 2){
                return ;
            }
        }
        if(list.size() == 2){
            sum += s1 + 1 + x;
        }
        return ;
    }
}