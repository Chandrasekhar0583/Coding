/**
 * @param {number[]} arr
 * @return {number[]}
 */
var sortByBits = function(arr) {
    const obj = arr.reduce((final , ele) => {
        const s = ele.toString(2);
        let count = 0;
        for(let char of s){
            if(char === '1'){
                count++;
            }
        }
        final.push([ele , count]);
        return final;
    } , [])

    const res = obj.sort((a,b) => {
        const x = a[1] - b[1];
        if(x === 0){
            return a[0] - b[0];
        }
        return x;
    });
    return res.map(([a,b]) => a);
};