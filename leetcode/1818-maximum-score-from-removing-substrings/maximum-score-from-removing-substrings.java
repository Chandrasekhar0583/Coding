class Solution {
    public int maximumGain(String s, int x, int y) {
        String s1,s2;
        Stack<Character> stk=new Stack<>();
        int l=s.length();
        int a1,b1,r1=0,r2=0;
        if(x>y){
            s1="ab";
            s2="ba";
            a1=x;
            b1=y;
        }
        else {
            s1="ba";
            s2="ab";
            a1=y;
            b1=x;
        }
        for (char v : s.toCharArray()) {
            if (!stk.isEmpty() && stk.peek() == s1.charAt(0) && v == s1.charAt(1)) {
                stk.pop();
                r1++;
            } else {
                stk.push(v);
            }
        }

      StringBuilder rem = new StringBuilder();
        while (!stk.isEmpty()) {
            rem.append(stk.pop());
        }
        rem.reverse();
         for (char v : rem.toString().toCharArray()) 
        {
            if (!stk.isEmpty() && stk.peek() == s2.charAt(0) && v == s2.charAt(1)) {
                stk.pop();
                r2++;
            } else {
                stk.push(v);
            }
        }
       return r1*a1+r2*b1;
    }
}