class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        n = len(words)
        ans = float("inf")

        for i in range(0,n):
            if(words[i] == target):
                cw_diff = abs(startIndex-i)
                acw_diff = abs(n-cw_diff)

                ans = min(ans,cw_diff,acw_diff)
        if(ans == float("inf")):
            return -1
        return ans

            
