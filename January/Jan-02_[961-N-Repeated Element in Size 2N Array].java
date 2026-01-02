//this soltion is based on pegion hold priciple :
//Since one element appears in exactly 50% of the array, it cannot stay more than 2 indices apart everywhere.

class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
        if(nums[i] == nums[i+1] || nums[i] == nums[i+2])
            return nums[i];
        }
        return nums[nums.length-1];
    }
}
