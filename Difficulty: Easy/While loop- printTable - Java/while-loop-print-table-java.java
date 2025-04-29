//{ Driver Code Starts
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public void calculateMultiples(int n) {
        // code here
        int m = 10;
        while( m > 0)
        {
            System.out.print( m * n + " ");
            m--;
        }
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an instance of Solution and call the method
        Solution solution = new Solution();
        solution.calculateMultiples(n);
    }
}

// } Driver Code Ends