/**
 * @param {number} n
 * @return {number}
 */
var binaryGap = function(n) {
    let gap = 0;
    let left = -1;
    let right = -1;
    for(let i = 0 ; i < 32 ; i++){
        if((n & (1 << i))){
            if(right === -1){
                right = i;
            }
            else{
                left = i;
                gap = Math.max(left - right , gap);
                right = i;
            }
        }
    }
    return gap;
};