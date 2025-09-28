class Solution {
    static int maxArea(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[m];
        int sum = 0;
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < m ; j++ )
            {
                if(mat[i][j] == 1)
                arr[j] += mat[i][j];
                else
                arr[j] = 0;
            }
            sum = Math.max(find(arr) , sum);
        }
        return sum;
    }
    public static int find( int arr[] )
    {
        int n = arr.length;
        int area = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ; i++)
        {
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i])
            {
                int top = stk.pop();
                int ar = arr[top] * (stk.isEmpty() ? i : i - stk.peek() - 1);
                area = Math.max(ar , area);
            }
            stk.push(i);
        }
        while(!stk.isEmpty())
        {
                int top = stk.pop();
                int ar = arr[top] * (stk.isEmpty() ? n : n - stk.peek() - 1);
                area = Math.max(ar , area);
        }
        return area;
    }
}