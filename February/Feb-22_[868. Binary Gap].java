class Solution {
    public int binaryGap(int n) {
        char[] bits = Integer.toBinaryString(n).toCharArray();
        List<Integer> idx = new ArrayList<>();

        for(int i=0;i<bits.length;i++)
            if(bits[i] == '1')
                idx.add(i);
            
        if(idx.size() == 1)
            return 0;

        int ans = 0;
        for(int i=0;i<idx.size()-1;i++)
            ans = Math.max(ans, (idx.get(i+1) - idx.get(i)));
        
        return ans;
        
    }
}
