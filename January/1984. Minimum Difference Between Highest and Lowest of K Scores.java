class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) 
            return 0;
            
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;

        for (int i = k - 1; i < nums.length; i++) {
            int temp = nums[i] - nums[i - k + 1];
            res = Math.min(res, temp);
        }

        return res;
    }
}
