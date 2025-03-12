//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        int n = s.length();
        if(n<=3)
        {
            int num = Integer.parseInt(s);
            if(num%8==0)
            return 1;
            else
            return -1;
        }
        else{
            int num = Integer.parseInt(s.substring(n-3));
              if(num%8==0)
            return 1;
            
        }
            return -1;
    }
}