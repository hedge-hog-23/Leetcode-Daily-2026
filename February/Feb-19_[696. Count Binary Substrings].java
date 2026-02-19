class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        if (n <= 1) return 0;

        //first pass: compute lengths of consecutive runs of the same char
        int[] runs = new int[n]; // worst case, all runs are length 1
        int r = 0;               // number of runs filled
        int i = 0;

        while (i < n) {
            char c = s.charAt(i);
            int len = 0;
            while (i < n && s.charAt(i) == c) {
                i++;
                len++;
            }
            runs[r++] = len; 
        }

        int res = 0;
        for (int k = 0; k < r - 1; k++) {
            res += Math.min(runs[k], runs[k + 1]);
        }
        return res;
    }
}
