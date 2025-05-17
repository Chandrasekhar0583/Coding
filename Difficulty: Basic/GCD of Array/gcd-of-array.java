//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int Arr[] = new int[n];
            for (int i = 0; i < n; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.gcd(n, Arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int gcd(int n, int arr[]) {
        // code here.
        int x = arr[0] ;
        for(int i = 1 ; i < n  ; i++ )
        {
            x = GCD(x,arr[i]);
        }
        return x;
    }
    public static int GCD(int a , int b)
    {
        if(b == 0)
        return a;
        return GCD(b,a%b);
    }
}