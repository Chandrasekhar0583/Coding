//{ Driver Code Starts
import java.util.*;

class checkBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String str = sc.nextLine();
            Solution g = new Solution();
            boolean b = g.isBinary(str);
            if (b == true)
                System.out.println("true");
            else
                System.out.println("false");
            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    boolean isBinary(String s) {
        // Your code here
        for(char c : s.toCharArray())
        {
            if(c=='0' || c=='1')
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}