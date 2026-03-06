/**
 * @param {string} s
 * @return {boolean}
 */
var checkOnesSegment = function(s) {
    let x = false;
    let y = false;
    for(let ch of s){
        if(ch === "1"){
            x = true;
             if(x && y){
                return false;
            }
        }else{
            y = true;
        }
    }
    return true;
};