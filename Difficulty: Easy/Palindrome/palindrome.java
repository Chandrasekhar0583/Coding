//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt();
            boolean ans = ob.isPalindrome(n);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        String s = ""+n;
        int low = 0;
        int high = s.length() - 1;
        while(low < high)
        {
            if(s.charAt(low) != s.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}