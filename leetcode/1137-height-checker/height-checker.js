/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    const sortedArray = heights.toSorted((a,b) => a - b);
    let count = 0;
    for(let i  = 0 ; i < heights.length ; i++){
        if(heights[i] !== sortedArray[i]){
            count++;
        }
    }
    return count;
};