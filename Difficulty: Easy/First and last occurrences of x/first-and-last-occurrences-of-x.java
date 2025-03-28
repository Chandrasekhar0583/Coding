//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = inputLine1.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(x, arr);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        int y = firstIndex(x,arr);
        res.add(y);
        if(y==-1)
        return res;
        y = lastIndex(x,arr);
        res.add(y);
        return res;
    }
    public int firstIndex(int x,int arr[])
    {
        int low =0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<x)
            low = mid+1;
            else if(arr[mid]>x)
            high = mid-1;
            else{
                if(mid==0 || arr[mid-1]!=x)
                return mid;
                else
                high = mid-1;
            }
        }
        return -1;
    }
    public int lastIndex(int x,int arr[])
    {
        int low =0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<x)
            low = mid+1;
            else if(arr[mid]>x)
            high = mid-1;
            else{
                if(mid==arr.length-1 || arr[mid+1]!=x)
                return mid;
                else
                low = mid+1;
            }
        }
        return -1;
    }
}
