/**
 * @param {number[]} nums
 * @return {number[]}
 */
var constructTransformedArray = function(nums) {
    const n = nums.length;
    const result = new Array(n);
    
    for (let i = 0; i < n; i++) {
        if (nums[i] === 0) {
            result[i] = nums[i];
        } else {
            let newIndex = ((i + nums[i]) % n + n) % n;
            result[i] = nums[newIndex];
        }
    }
    
    return result;
};