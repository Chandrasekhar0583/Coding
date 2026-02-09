/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    nums.forEach((ele , ind) =>{
        init = fn(init , ele);
    });
    return init;
};