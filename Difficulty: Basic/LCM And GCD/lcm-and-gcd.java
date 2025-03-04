//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int arr[] = new int[2];
        int x = gcd(a,b);
        int mul = a*b;
        arr[1] = x;
        arr[0] = mul/x;
        return arr;
    }
    public static int gcd (int a, int b)
    {
        while(b!=0)
        {
            int x = a%b;
            a=b;
            b=x;
        }
        return a;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends