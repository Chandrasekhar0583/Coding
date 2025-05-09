//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        int carry = 1;
        for(int i = N - 1 ; i >=0 ;i--)
        {
            int x = arr.get(i) + carry;
            carry = x / 10;
            arr.set(i , x % 10);
            if(carry == 0)
            break ;
        }
        if(carry == 1)
        {
            arr.add( 0 ,1);
        }
        return arr;
    }
};