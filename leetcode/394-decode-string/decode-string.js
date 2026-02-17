/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function (s) {
    const n = s.length;
    let stack = [];
    for (let i = n - 1; i >= 0; i--) {
        const ch = s.charAt(i);
        if (ch === '[') {
            let n1 = ""
            let j = i - 1;
            while (j >= 0 && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                n1 = s.charAt(j) + n1;
                j--;
            }
            i = j + 1;
            let num = Number(n1);
            let str = "";
            while (stack[0] !== ']') {
                str += stack.shift();
            }
            stack.shift();
            console.log(str);
            str = str.repeat(num);
            stack.unshift(str);
        }
        else {
            stack.unshift(ch);
        }
    };
    let res = "";
    while (stack.length !== 0) {
        res += stack.shift();
    }
    return res;
};