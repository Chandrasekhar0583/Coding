/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
    let flag = ((n & 1) === 1 ? true : false);
    n >>= 1;

    while(n > 0){
        let f =  ((n & 1) === 1 ? true : false );
        // console.log(f +" " + flag);
        if(f === flag){
            return false;
        }
        flag = !flag;
        n >>= 1;
    }
    return true;
};