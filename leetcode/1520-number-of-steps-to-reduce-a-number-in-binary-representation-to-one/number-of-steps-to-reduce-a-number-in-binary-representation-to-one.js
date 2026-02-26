/**
 * @param {string} s
 * @return {number}
 */
var numSteps = function(s) {
    let arr = s.split("");
    arr.reverse();
    let res = 0;
    while(arr.length !== 1){
        if(arr[0] === '0'){
            arr.shift();
        }
        else{
            let ind = -1;
            arr[0] = "0";
            for(let i = 1 ; i < arr.length ; i++){
                if(arr[i] === '0'){
                    ind = i;
                    break;
                }else{
                    arr[i] = "0";
                }
            }
            if(ind === -1){
                arr.push("1");
            }else{
                arr[ind] = "1";
            }
        }
        res++;
    }
    return res;
};