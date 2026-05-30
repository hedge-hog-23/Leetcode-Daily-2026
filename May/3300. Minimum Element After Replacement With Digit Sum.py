class Solution:
    def minElement(self, nums: List[int]) -> int:
        def digit_sum(num):
            sum = 0
            while(num >0):
                sum = sum + (num%10)
                num = num//10
            return sum
        mini = 100000001
        for i in range(0,len(nums)):
            mini = min(mini,digit_sum(nums[i]))
        return mini
