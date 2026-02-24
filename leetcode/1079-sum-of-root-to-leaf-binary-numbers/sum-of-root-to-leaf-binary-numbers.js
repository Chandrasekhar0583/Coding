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
 * @return {number}
 */
 var total ;
var sumRootToLeaf = function(root) {
    total = 0;
    fun(root , "")
    return total;
};

var fun = (root , str) =>{
    if(root === null){
        return ;
    }
    str += root.val;
    fun(root.left , str );
    fun(root.right , str );
    if(root.left === null && root.right === null){
        total += parseInt(str , 2);
    }
}