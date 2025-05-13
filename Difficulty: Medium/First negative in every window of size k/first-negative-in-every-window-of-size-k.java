//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ; i < k ; i++)
        {
            if(arr[i] < 0)
            dq.addLast(i);
        }
        for(int i = k ; i < n ; i++)
        {
            if(!dq.isEmpty())
            {
                list.add(arr[dq.peekFirst()]);
            }
            else{
                list.add(0);
            }
            while(!dq.isEmpty() && i -dq.peekFirst()  >= k )
            {
                dq.pollFirst();
            }
            if(arr[i] < 0)
            dq.addLast(i);
            
        }
         if(!dq.isEmpty())
            {
                list.add(arr[dq.peekFirst()]);
            }
            else{
                list.add(0);
            }
        return list;
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
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

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            List<Integer> ans = ob.firstNegInt(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends