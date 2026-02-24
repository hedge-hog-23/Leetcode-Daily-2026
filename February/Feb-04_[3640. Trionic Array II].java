class Solution {
    public long maxSumTrionic(int[] nums) {
        long ans = Long.MIN_VALUE;          // removed duplicate untyped 'ans'
        if (nums == null || nums.length < 2) {
            return ans;                     // no "up" possible
        }

        long prev = nums[0];

        int n = nums.length;
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            long newA = Long.MIN_VALUE;
            long newB = Long.MIN_VALUE;
            long newC = Long.MIN_VALUE;
            long curr = nums[i];

            if (curr > prev) {
                
                long baseA = Math.max(a, prev);
                if (baseA != Long.MIN_VALUE) 
                    newA = baseA + curr;

                long baseC = Math.max(c, b);
                if (baseC != Long.MIN_VALUE) 
                    newC = baseC + curr;
            } 
            else if (curr < prev) {
                
                long baseB = Math.max(b, a);
                if (baseB != Long.MIN_VALUE) 
                    newB = baseB + curr;
            }

            a = newA;
            b = newB;      
            c = newC;

            ans = Math.max(ans, c);
            prev = curr;
        }

        return ans;
    }
}
