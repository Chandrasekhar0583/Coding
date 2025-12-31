class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<String , Integer> map = new HashMap<>();
        int min =  fun(0 , map , cost);
        int min1 =  fun(1 , map , cost);
        return Math.min(min , min1);
    }
    public int fun(int ind , HashMap<String , Integer> map , int cost[]){
        if(ind >= cost.length) return 0;

        if(ind == cost.length - 1) return cost[ind];
        
        String key = "" + ind;

        if(map.containsKey(key)) return map.get(key) ;


        int cos = fun(ind + 1 , map , cost);
        int cos1 = fun(ind + 2 , map , cost);

        map.put( key , Math.min(cos1  , cos) + cost[ind]) ;

        return map.get(key);
    }
}