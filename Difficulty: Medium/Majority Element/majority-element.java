//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // code here
        int count = 1;
        int res = arr[0];
        for( int i = 1 ; i < arr.length ; i++ )
        {
            if( arr[i] == res)
            {
                count++;
            }
            else
            {
                count--;
            }
            if( count == 0 )
            {
                count = 1;
                res = arr[i];
            }
        }
        count = 0;
        for( int i : arr )
        {
            if( i == res )
            count++;
        }
        return count > arr.length / 2 ? res : -1;
    }
}