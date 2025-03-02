//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // Read the number of test cases
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine()); // Parse input as an integer

            Solution ob = new Solution();
            if (ob.isPerfectNumber(N))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
        int sum = 0;
        for(int i =2 ;i<=Math.sqrt(n) ; i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    sum+=i;
                }
                else
                {
                    sum+= i + n/i;
                }
            }
        }
        sum++;
        // System.out.println(sum);
        if(sum==n)
        return true;
        return false;
    }
};