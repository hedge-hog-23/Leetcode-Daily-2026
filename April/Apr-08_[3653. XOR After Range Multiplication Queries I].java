class Solution {
    private static int mod = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];

            for(int i=l;i<=r;i+=k){
                nums[i] = (int) (((long)nums[i] * v) % mod);
            }
        }
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
}
