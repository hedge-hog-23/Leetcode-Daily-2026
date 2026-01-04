class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        
        for (int n : nums) {
            int count = 0;
            int currSum = 0;
            //iterate up to the square root of n, as if i is divisor then n/i is also a divisor
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    currSum += i;
                    
                    //square root edge case, else do * 2 and subt -1 for perfect squares :)
                    if (i * i != n) {
                        count++;
                        currSum += n/i;
                    }
                }
                if (count > 4) break; //will work if you remove this as weel, just for optimization :/
            }
            if (count == 4)
                totalSum += currSum;
        }
        return totalSum;
    }
}
