//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();

            Solution obj = new Solution();

            if (obj.search(p, s) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) {
        // Your code here
        int h = 1;
        int n= txt.length();
        int m = pat.length();
        int q =  997;
        int d = 7;
        for(int i=1;i<m;i++)
        {
            h = (h*d)%q;
        }
        int p = 0,  t =0;
        for(int i =0 ;i <m;i++)
        {
            p = (p*d +(pat.charAt(i)-'a'+1))%q;
            t = (t*d +(txt.charAt(i)-'a'+1))%q;
        }
        for(int i = 0 ;i<=n-m;i++)
        {
            if(p==t)
            {
                String s = txt.substring(i,i+m);
                if(s.equals(pat))
                return true;
            }
            if(i<n-m)
            t = ((d*(t-(txt.charAt(i)-'a'+1)*h))+(txt.charAt(i+m)-'a'+1))%q;
            
            if(t<0)
            t = t+q;
        }
        return false;
    }
}
