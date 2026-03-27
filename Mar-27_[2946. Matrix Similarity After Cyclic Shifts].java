class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int[] i : mat){
            int n = i.length;
            for(int j=0; j< n;j++){
                if(i[j] != i[(j+k) % n])
                    return false;
            }
        }
        return true;
    }
}
