//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> res = new ArrayList<>();
        res.add(1l);
        if(n==1)
        return res;
        res.add(2l);
         if(n==3 || n==2)
        return res;
        int i = 3;
        while(res.get(i-2)*i<=n)
        {
            
            res.add(res.get(i-2)*i);
            i++;
        }
    
        return res;
        
    }
}