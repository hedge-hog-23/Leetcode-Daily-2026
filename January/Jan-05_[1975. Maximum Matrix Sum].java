class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minElement = Integer.MAX_VALUE;
        int n = matrix.length;
        int negativeCt = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int curr = matrix[i][j];
                if(curr < 0)
                    negativeCt++;
            }
        }

        if(negativeCt %2!= 0)
            sum = sum - 2L*minElement; //why 2 times minEle ? cuz 1st - we added it's abs value in above for loops, we need to remove that, 2nd - we need to actaully subtract it from our sum (cuz its duplicated in above for loop traversal )
            //ex [1,-1]
            //   [1,1]  -> in for loops we total up abs value to get 1+1+1+1 = 4, we have added that -1, but we need to subtract it actaully so 4-1-1 = 2a
        return sum;

    }

}
