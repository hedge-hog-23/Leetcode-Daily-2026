class Solution {
    private boolean isPrime(int n){
        if (n <= 1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    // private int setBitCounter(int x){
    //     int ct = 0;
    //     for(int i=0;i<32;i++){
    //         ct+=(x & 1);
    //         x >>= 1;
    //     }
    //     return ct;
    // }
    public int countPrimeSetBits(int left, int right) {
        int ct = 0;
        for(int i=left;i<=right;i++){
            int bits = Integer.bitCount(i);
            if(isPrime(bits))
                ct++;
        }
        return ct;
    }
}
