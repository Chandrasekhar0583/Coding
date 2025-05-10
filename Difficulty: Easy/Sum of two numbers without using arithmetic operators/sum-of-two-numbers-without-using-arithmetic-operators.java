//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
import java.math.BigInteger;

class GFG
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
		    String S[] = br.readLine().split(" ");
            
            int a = Integer.parseInt(S[0]);
            int b = Integer.parseInt(S[1]);
			Solution obj = new Solution();
			System.out.println(obj.sum(a,b));
            t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sum(int a, int b) {
      int res = 0, carry = 0, i = 0;
while (i < 32) {
    int x = (a >> i) & 1;
    int y = (b >> i) & 1;
    int sum = x ^ y ^ carry;
    res |= (sum << i);
    carry = (x & y) | (x & carry) | (y & carry);
    i++;
}

        return res;
    }
}