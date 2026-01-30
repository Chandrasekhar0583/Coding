/**
 * @param {number[]} nums
 * @return {number[][]}
 */
 var res = [];
var permute = function(nums) {
    let n = nums.length;
    var vis = new Array(n).fill(false);
    res = [];
    var a = [];
    fun(nums , vis , 0 , a );
    return res;
};
var fun = (nums , vis , ind , a) =>{
    if(nums.length === ind) {
        res.push([...a]);
        return ;
    }
    for(let i = 0 ; i < nums.length ; i++){
        if(i > 0 && nums[i] === nums[ i - 1] && !vis[i - 1]) continue;
        if(vis[i]) continue;
        vis[i] = true;
        a.push(nums[i]);
        fun(nums , vis , ind + 1 , a);
        vis[i] = false;
        a.pop();
    }
}