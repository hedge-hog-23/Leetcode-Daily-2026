class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1)
            return '0';
        int len = 1<< n;  //eqv to 2^n (its the max length possible)

        if(k < len/2){
            return findKthBit(n-1,k);
        }
        else if(k == len/2){
            return '1';
        }
        else{
            return ((findKthBit(n-1,len-k) == '0') ? '1' : '0');
        }
    }
}
