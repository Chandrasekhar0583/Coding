//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int n = S.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] result = obj.countOddEven(arr);
            for (Integer t : result) {
                System.out.print(t + " ");
            }
            System.out.println(" ");
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int nums[] = new int[2];
        for ( int  i : arr)
        {
            if( i % 2 == 0 )
            nums[1]++;
            else
            nums[0]++;
        }
        return nums;
    }
}