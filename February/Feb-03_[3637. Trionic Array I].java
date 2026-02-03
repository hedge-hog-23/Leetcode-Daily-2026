class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 1;
        while(i<n && nums[i-1] < nums[i]){
            i++;
        }
        int p = i-1;

        while(i<n && nums[i-1] > nums[i]){
            i++;
        }
        int q = i-1;

        while(i<n && nums[i-1] < nums[i]){
            i++;
        }
        int last = i-1;
        
        return (p != 0) && (q!=p) && (last != q) && (last == n - 1);
    }
}
