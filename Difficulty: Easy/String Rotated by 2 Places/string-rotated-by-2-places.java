//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s12 = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Solution obj = new Solution();

            boolean flag = obj.isRotated(s1, s2);

            if (flag == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Your code here
      int n1 = s1.length();
      int n2 = s2.length();
      if(n1!=n2)
      return false;
      boolean clock = true;
      boolean anticlock = true;
      for(int i = 0 ;i<n1 ;i++)
      {
          if(s1.charAt(i)!=s2.charAt((i+2)%n1))
          {
              clock = false;
          }
      }
      for(int i = 0 ;i<n1 ;i++)
      {
          if(s2.charAt(i)!=s1.charAt((i+2)%n1))
          {
              anticlock = false;
          }
      }
      return clock?clock:anticlock;
    }
}