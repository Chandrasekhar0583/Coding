//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        if(k>=arr.size())
        {
            reverse(arr,0,arr.size()-1);
            return ;
        }
        // k=k-1;
        int i =0;
        while(i<arr.size())
        {
            if(i+k>arr.size()-1)
            reverse(arr,i,arr.size()-1);
        else{
            reverse(arr,i,i+k-1);
        }
        i=i+k;
        }
    }
    void reverse(ArrayList<Long> arr, int start ,int end)
    {
        while(start<end)
        {
            long x = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,x);
            start++;
            end--;
        }
    }
}


//{ Driver Code Starts.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends