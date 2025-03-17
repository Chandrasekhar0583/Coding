//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(inputLine[i]));
            }

            Solution obj = new Solution();
            int[] product = obj.minAnd2ndMin(arr);
            if (product[0] == -1)
                System.out.println(product[0]);
            else
                System.out.println(product[0] + " " + product[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int q[] = {-1};
        if(arr.length ==1)
        return q;
        else if(arr.length==2)
        {
            if(arr[0]==arr[1])
            return q;
            else
            {
                Arrays.sort(arr);
            }
            return arr;
        }
        int nums[] = new int[2];
        nums[0]  = arr[0];
        nums[1]  = arr[1];
        for(int i:arr)
        {
            if(i<nums[0])
            {
                nums[1] = nums[0];
                nums[0] = i;
            }
            else if(nums[0] <i &&i<nums[1])
            {
                nums[1] = i;
            }
            // else if(nums[0]==nums[1])
            // nums[1] = i;
        }
        if(nums[0]==nums[1])
        return q;
        return nums;
    }
}
