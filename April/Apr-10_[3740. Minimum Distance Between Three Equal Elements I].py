class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        n = len(nums)
        mini = float("inf")
        for i in range(0,n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    if(nums[i] == nums[j] == nums[k]):
                        mini = min(mini, abs(i - j) + abs(j - k) + abs(k - i))
        

        if(mini == float("inf")):
            return -1
        return mini
