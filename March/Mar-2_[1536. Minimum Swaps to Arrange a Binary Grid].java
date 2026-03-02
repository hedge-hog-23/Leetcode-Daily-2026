class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int zeros[] = new int[n];
        //count trailing zeros

        for(int i=0;i<n;i++){
            int ct = 0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j] == 0)
                    ct++;
                else
                    break;
            }
            zeros[i] = ct;
        }

        int swaps = 0;
        for(int i=0;i<n;i++){
            int reqZeros = n-i-1;
            int j = i;
            while(j<n && zeros[j]<reqZeros){
                j++;
            }
            if(j == n)
                return -1; //false case

            //bubble sort
            while(j > i){
                int tmp = zeros[j];
                zeros[j] = zeros[j-1];
                zeros[j-1] = tmp;
                j--;
                swaps++;
            }
        }
        return swaps;
    }
}
