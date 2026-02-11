/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const memo = new Map();
    return function(...args) {
        const key = JSON.stringify(args);
        let val;

        if(memo.has(key)) return memo.get(key);

        if(args.length === 1){
            val =  fn(args[0]);
        }
        else{
            val =  fn(args[0],args[1]);
        }

        memo.set(key , val);
        return val;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */