/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] des) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,TreeNode[]> map = new HashMap<>();
        for(int a[] : des){
            int ind = a[2];
            TreeNode child = new TreeNode(a[1]);
            if(!map.containsKey(a[0])){
                map.put(a[0], new TreeNode[]{null ,null});
            }
            TreeNode arr[] = map.get(a[0]);
            arr[ind] = child;
            map.put(a[0], arr);
            list.add(a[1]);
        }
        TreeNode root = null;
        for(Integer node : map.keySet()){
            if(!list.contains(node)){
                root = new TreeNode(node);
                break;
            }
        }
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode cur = que.poll();
            if(!map.containsKey(cur.val)) continue;
            TreeNode arr[] = map.get(cur.val);
            if(arr[1] != null){
                cur.left = arr[1];
                que.add(arr[1]);
            }
            if(arr[0] != null){
                cur.right = arr[0];
                que.add(arr[0]);
            }
        }
        return root;
    }
}