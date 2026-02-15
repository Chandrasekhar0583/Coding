/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let i = a.length - 1;
    let j = b.length - 1;
    let carry = 0;
    let ans = '';

    while (i >= 0 || j >= 0 || carry === 1) {
        const bitA = i >= 0 ? Number(a[i]) : 0;
        const bitB = j >= 0 ? Number(b[j]) : 0;

        const sum = bitA + bitB + carry;
        ans = (sum % 2) + ans;
        carry = Math.floor(sum / 2);

        i--;
        j--;
    }

    return ans;
};
