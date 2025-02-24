//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++
class Solution {
  public:
    string longestCommonPrefix(vector<string> arr) {
        // your code here
        string s="";
        if(arr.size()==1)
        return arr.at(0);
        int ind = common(arr[0],arr[1]);
        if(ind==-1)
        return s;
        else
        {
         s = arr[0].substr(0,ind); 
            
        }
        for(int i=2 ;i <arr.size();i++)
        {
            // std::cout<<s<<std::endl;
             ind = common(s,arr[i]);
             if(ind==-1)
             return "";
             else
             s = s.substr(0,ind);
        }
        return s;
    }
    public:
    int common(string s1 , string s2)
    {
        int len  = std::min(s1.length(),s2.length());
        int i=0;
        while(i<len && s1[i]==s2[i])
        {
            i++;
        }
        return i==0?-1:i;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<string> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        string number;
        while (ss >> number) {
            arr.push_back(number);
        }

        Solution ob;
        string ans = ob.longestCommonPrefix(arr);
        if (ans.empty())
            cout << "\"\"";
        else
            cout << ans;
        cout << endl;
    }
}

// } Driver Code Ends