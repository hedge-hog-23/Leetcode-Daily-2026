//approach 1 using 4d dp;

class Solution {
    int solve(int i, int n, int prev1, int prev2, int prev3, int[][][][] dp){
        if(i == n)
            return 1;
        if(dp[i][prev1 + 1][prev2 +1][prev3+1] != -1){
            return dp[i][prev1+1][prev2+1][prev3+1];
        }
        int ans = 0;
        for(int c1 = 0;c1<3;c1++){
            for(int c2 = 0;c2<3;c2++){
                for(int c3 = 0;c3<3;c3++){
                    if(c1 != c2 && c2 != c3 && c1 != prev1 && c2!= prev2 && c3 != prev3)
                        ans = (ans + solve(i+1,n,c1,c2,c3,dp)) % 1000000007;
                }
            }
        }
        dp[i][prev1 + 1][prev2 + 1][prev3 + 1] = ans;
        return ans;
    }
    public int numOfWays(int n) {
        int[][][][] dp = new int[n+1][4][4][4]; //we use 4 cuz of colors - {-1,0,1,2} 0,1,2 are r,y,g colors but why -1
        //its to fill 1st row which has no prev :(

        for(int i=0;i<=n;i++){
            for(int a=0;a<4;a++){
                for(int b=0;b<4;b++){
                    for(int c=0;c<4;c++){
                        dp[i][a][b][c] = -1; //assuming -1 as false case - not computized
                    }
                }
            }
        }

        return solve(0,n,-1,-1,-1,dp);


    }
}


//approach 2 using simulation math;
class Solution {
    public int numOfWays(int n) {
        long aba = 6;
        long abc = 6;

        for(int i=1;i<n;i++){
            long nxtAba = (3 * aba + 2 * abc) % 1000000007;
            long nxtAbc = (2*aba + 2 *abc) % 1000000007;
            aba = nxtAba;
            abc = nxtAbc;
        }

        return (int)((aba+abc) % 1000000007);
    }
}
