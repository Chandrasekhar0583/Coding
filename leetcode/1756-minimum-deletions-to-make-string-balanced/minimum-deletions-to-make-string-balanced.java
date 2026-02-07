class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stk=new Stack<>();
        int c=0;
        for(char a : s.toCharArray() )
        {
            if(!stk.isEmpty() && stk.peek()=='b' && a=='a')
            {
                stk.pop();
                c++;
            }
            else
            {
                stk.push(a);
            }
        }
        return c;

    }
}