class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        sum,maxi = 0,0
        for i in gain:
            sum = sum + i
            maxi = max(maxi,sum)
        return maxi
