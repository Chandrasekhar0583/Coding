//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==k)
            return i;
        }
        return -1;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }
            int k = Integer.parseInt(br.readLine());

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.firstElementKTime(arr, k);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends