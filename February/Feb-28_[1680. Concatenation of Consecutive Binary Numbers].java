class Solution {
    private static final long MOD = 1_000_000_007;

    public int concatenatedBinary(int n) {
        int bitShiftCt = 0;
        long ans = 0;
        for(int i=1;i<=n;i++){
            if((i&(i-1)) == 0) 
                bitShiftCt++;
            ans = ((ans << bitShiftCt) | i)%MOD;  //ans * 2^bitShidtCt | i
        }
        return (int)ans;
    }
}
