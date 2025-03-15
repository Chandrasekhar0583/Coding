#User function Template for python3


class Solution:
    def factorial (self, n):
        # code here
        i = 1
        fact =1
        while i<=n:
            fact = fact*i
            i = i+1
        return fact

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        ob = Solution()
        print(ob.factorial(n))

        print("~")

# } Driver Code Ends