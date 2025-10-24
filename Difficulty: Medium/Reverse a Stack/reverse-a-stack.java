class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int x = st.pop();
        reverseStack(st);
        insertAtBottom(st, x);
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insertAtBottom(st, x);
        st.push(temp);
    }
}
