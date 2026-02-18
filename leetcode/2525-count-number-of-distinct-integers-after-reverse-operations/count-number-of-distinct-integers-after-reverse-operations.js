/**
 * @param {number[]} nums
 * @return {number}
 */
var countDistinctIntegers = function(nums) {
    const n = nums.length;
    let set = new Set();
    for(let num of nums){
        let temp = num;
        let rev = 0;
        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num = Math.floor(num / 10);
        }
        set.add(temp);
        set.add(rev);
    }
   
    return set.size;
};