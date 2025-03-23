//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int flr = -1;
        int cl = Integer.MAX_VALUE;

        for (int a : arr) {
            if (a <= x && a > flr) {
                flr = a;
            }  if (a >= x && a < cl) {
                cl = a;
            }
        }

        int[] res = new int[2];
        res[0] = flr;
        res[1] = (cl == Integer.MAX_VALUE) ? -1 : cl;

        return res;
    }
}

