class Solution:
    def check(self, nums: List[int]) -> bool:

        res = 0
        for i in range(0,len(nums)):
            if(nums[i]>nums[(i+1)%len(nums)]):
                res+=1

        if res >1:
            return False
        return True
