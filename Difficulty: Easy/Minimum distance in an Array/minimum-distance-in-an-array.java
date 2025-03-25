//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            Solution g = new Solution();
            System.out.println(g.minDist(arr, x, y));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int prev = -1;
        int res=arr.length+1;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==x || arr[i]==y)
            {
                if(prev==-1)
                {
                    prev = i;
                }
                else{
                    if (arr[prev]==arr[i])
                    {
                        prev = i;
                    }else{
                        res = Math.min(i-prev,res);
                        prev = i;
                    }
                }
            }
        }
        return res==arr.length+1?-1:res;
    }
}