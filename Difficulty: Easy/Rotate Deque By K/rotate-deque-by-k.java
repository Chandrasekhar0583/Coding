class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        if(type==1)
        {
        for(int i=0;i<k;i++)
        {
            int x = dq.pollLast();
            dq.addFirst(x);
        }
        }
        else
        {
            for(int i=0;i<k;i++)
        {
            
            int x = dq.pollFirst();
            dq.addLast(x);
        }
        }
    }
}