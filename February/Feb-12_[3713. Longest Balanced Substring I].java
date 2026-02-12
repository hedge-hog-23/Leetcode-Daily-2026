class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int freq[] = new int[26]; //as its all lowercase else use 256
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int k : freq){
                    if(k>0){
                        min = Math.min(min,k);
                        max = Math.max(max,k);
                    }
                }
                if(min == max)
                    ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}
