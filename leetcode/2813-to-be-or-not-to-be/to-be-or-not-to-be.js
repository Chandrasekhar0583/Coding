/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    class Myclass{
         toBe = (n) =>{
            // console.log(val);
            if(n === val){
                return  true;
            }
            else{
                throw new Error( "Not Equal");
            }
        }
         notToBe = (n) => {
            if(n !== val){
                return true;
            }
            else{
                throw new Error("Equal");
            }
        }
    }
    return new Myclass();
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */