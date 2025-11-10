// User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    static int i = 0;
    public static void convertToMaxHeapUtil(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        fun(list , root);
        // System.out.println(list);
        i = 0;
        fun1(list , root);
    }
    public static void fun1(ArrayList<Integer> list , Node root)
    {
        if(root == null ) return ;
        fun1(list , root.left);
        
        // list.add(root.data);
        
        fun1(list , root.right);
        
        root.data = list.get(i);
        i++;
    }
    public static void fun(ArrayList<Integer> list , Node root)
    {
        if(root == null ) return ;
        fun(list , root.left);
        
        list.add(root.data);
        
        fun(list , root.right);
    }
}