class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int result[] = new int[nums.length];
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                int newIdx = nums[i];
                result[i] = nums[(i + newIdx) % n];
            }
            else if(nums[i] < 0){
                int newIdx = Math.abs(nums[i]) % n;
                result[i] = nums[(i - newIdx + n) % n];
            }
            else{
                result[i] = nums[i];
            }
        }   
        return result;     
    }
}
