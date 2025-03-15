#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        sum = 0;
        temp = n;
        while temp!=0:
            r = temp%10
            sum = sum+ r*r*r
            temp = temp//10
            
        return n==sum


#{ 
 # Driver Code Starts
# Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = input()
        n = int(n)
        ob = Solution()
        flag = ob.armstrongNumber(n)
        if flag:
            print("true")
        else:
            print("false")
        print("~")
# } Driver Code Ends