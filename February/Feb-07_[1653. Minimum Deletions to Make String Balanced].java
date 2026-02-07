class Solution {
    public int minimumDeletions(String s) {
        int res = 0;
        int ct = 0;

        for(char c : s.toCharArray()){
            if(c == 'b')
                ct++;
            else if(ct != 0){
                res+=1;
                ct-=1;
            }
        }
        return res;
    }
}
