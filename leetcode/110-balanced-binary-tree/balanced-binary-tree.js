/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
 var flag ;
var isBalanced = function(root) {
    flag = true;
    check(root);
    return flag;
};
var check = function(root){
    if(root === null) return 0;
    let left = check(root.left);
    let right = check(root.right);
    if(Math.abs(left - right) > 1){
        flag = false;
    }

    return Math.max(left,right) + 1;
}