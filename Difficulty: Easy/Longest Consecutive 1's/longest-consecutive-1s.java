//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        int max = 0;
        int len = 0;
        int i =0;
        while(i<32)
        {
            if((N&(1<<i))>0)
            {
                len++;
            }
            else{
                len =0;
                
            }
           max = Math.max(len,max);
           i++;
        }
        return max;
    }
}




//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		
System.out.println("~");
}
	}
}



// } Driver Code Ends