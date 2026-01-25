/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var rotateElements = function(nums, k) {
    var nonneg = nums.filter(a => a >= 0);
    if(!nonneg) return nums;
    // console.log(nonneg);
    let n = nonneg.length;
    k = k % n;
    nonneg = rotate(nonneg , 0 , k - 1);
    nonneg = rotate(nonneg , k , n - 1);
    nonneg = rotate(nonneg , 0 , n -1);

    let i = -1;
    let j = 0;

    const nums2 = nums.map((a , ind) =>{
        if(a >= 0 ){
            i++;
            return nonneg[i];
        }
        else{
            return a;
        }
    });
    return nums2;
    // while(j < nums.length && i < n){
    //     if(nums[j] > 0)
    // }
 };
var rotate = (nums , low , high) =>{
    while(low < high){
        let v = nums[low];
        nums[low] = nums[high];
        nums[high] = v;
        low++;
        high--;
    }
    return nums;
}