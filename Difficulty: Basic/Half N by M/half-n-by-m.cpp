//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// User function Template for C++

class Solution{
public:
    int mthHalf(int N, int M){
        // code here
        while(N!=0 && M-->1)
        {
            N = N/2;
        }
        return N;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N, M;
        cin>>N>>M;
        
        Solution ob;
        cout<<ob.mthHalf(N, M)<<"\n";
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends