class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        def g_cd(a,b):
            while b!=0:
                a,b=b,a%b
            return a
        
        return gcd(n**2,n*(n+1)) 
