/**
 * @param {number} left
 * @param {number} right
 * @return {number}
 */
var countPrimeSetBits = function(left, right) {
    let count = 0;
    while(left <= right){
        let c = 0;
        let x = left;
        while(x > 0){
            c += (x & 1);
            x >>= 1;
        }
        if(isPrime(c)){
            count++;
        }
        left++;
    }
    return count;
};

var isPrime = (n) => {
    if(n <= 1){
        return false;
    }
    if(n === 2 || n === 3){
        return true;
    }
    if(n % 2 === 0 || n % 3 === 0){
        return false;
    }
    for(let i = 5 ; i * i <= n ; i += 6){
        if(n % i === 0 || (n % (i + 2)) === 0){
            return false;
        }
    }
    return true;
}