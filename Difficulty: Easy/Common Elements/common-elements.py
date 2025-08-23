#User function Template for python3

class Solution:
    def commonElements(self,a,b):
        #code here
        res = []
        a.sort()
        b.sort()
        i = 0 
        j = 0
        n1 = len(a)
        n2 = len(b)
        while i < n1 and j < n2:
            if a[i] == b[j]:
                res.append(a[i])
                i += 1
                j += 1
            elif a[i] < b[j]:
                i += 1
            else:
                j += 1
        return res