class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
      //just traverse and find the distance
        for(int i=1;i < points.length;i++){
            int temp1 = Math.abs(points[i][0] - points[i-1][0]);
            int temp2 = Math.abs(points[i][1] - points[i-1][1]);
            ans += Math.max(temp1,temp2);
        }
        return ans;

    }
}
