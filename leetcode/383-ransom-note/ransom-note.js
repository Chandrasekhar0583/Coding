/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let arr = new Array(26).fill(0);
    for(let i of ransomNote){
        let x = i.charCodeAt(0) - 'a'.charCodeAt(0);
        console.log(x , i);
        arr[x]++;
    }
    for(let i of magazine){
        let x = i.charCodeAt(0) - 'a'.charCodeAt(0);
        arr[x]--;
    }
    for(let i of arr){
        if(i > 0){
            return false;
        }
    }
    return true;
};