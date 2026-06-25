class Solution:
    def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
        temp = [0] * len(nums)
        for i in range(0,len(nums)):
            if(nums[i] == target):
                temp[i] = 1
            else:
                temp[i] = -1
        
        ct = 0
        for i in range(0,len(nums)):
            ans = 0
            for j in range(i,len(nums)):
                ans += temp[j]
                if(ans >0):
                    ct+=1
        return ct
