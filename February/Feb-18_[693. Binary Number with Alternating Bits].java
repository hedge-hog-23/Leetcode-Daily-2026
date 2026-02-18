class Solution {
    public boolean hasAlternatingBits(int n) {
        int m = (n >>1) + n;
        return ((m & (m+1)) == 0) ? true : false;
    }
}

/*
n       = 101010
n >> 1  = 010101
----------------
m       = 111111
A number consisting of all 1s satisfies:

if m & (m + 1) == 0 true else false

use m as long if it gives tle*/
