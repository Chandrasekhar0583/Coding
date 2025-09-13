/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    a = new Array(26);
    for(let i = 0 ; i < a.length ; i++)
    {
        a[i] = 0;
    }
    for(let ch of s)
    {
        let n = ch.charCodeAt(0) - 97;
        a[n] += 1
    }
    let vow = 0 , cons = 0;
    for(let i = 0 ; i < 26 ; i++)
    {
        if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20)
        {
            vow = Math.max(vow , a[i]);
        }
        else{
            cons = Math.max(cons , a[i]);
        }
    }
    return vow+cons;
};