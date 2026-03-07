/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    let arr1 = new Array(10).fill(0);
    let arr2 = new Array(10).fill(0);
    let n = arr1.length;
    let b = 0 , c = 0;
    for(let i = 0 ; i < secret.length ; i++){
        if(secret.charAt(i) === guess.charAt(i)){
            b++;
        }else{
            arr1[secret.charAt(i) - '0']++;
            arr2[guess.charAt(i) - '0']++;
        }
    }
    for(let i = 0 ; i < 10 ; i++){
        if(arr1[i] > 0){
            c += Math.min(arr1[i] , arr2[i]);
        }
    }
    return `${b}A${c}B`;
};