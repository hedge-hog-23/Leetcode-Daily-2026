class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int curr = nums.get(i);
            int tmp = -1;
            for(int j=1;j<curr;j++){
                if((j|(j+1)) == curr){
                    tmp = j;
                    break;
                }
            }
            res[i] = tmp;
        }
        return res;
    }
}
