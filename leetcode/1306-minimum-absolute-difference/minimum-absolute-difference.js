/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
    arr.sort((a , b) => a - b);
    const val = arr.reduce((min , v , i)=>{
        if(i == 0) return min;

        return Math.min(min , v - arr[i -1])
    } , Infinity);

    const res = arr.reduce((r , a , i) =>{
        if(i > 0 && Math.abs(a - arr[i - 1]) === val){
            r.push([arr[i - 1] , a]);
        }
        return r;
    } , []);
    return res;
};