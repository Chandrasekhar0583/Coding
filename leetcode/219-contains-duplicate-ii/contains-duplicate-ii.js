/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    var obj = new Map();
    for(let i = 0 ; i <= k && i < nums.length; i++){
        if(obj.has(nums[i]))
        {
            return true;
        }
        else{
            obj.set(nums[i] , 1);
        }
    }
    for(let i = k + 1; i < nums.length ; i++){
        obj.delete(nums[i - k - 1]);
         if(obj.has(nums[i]))
        {
            return true;
        }
        else{
            obj.set(nums[i] , 1);
        }
    }
    return false;
};