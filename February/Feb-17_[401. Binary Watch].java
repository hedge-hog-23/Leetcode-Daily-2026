class Solution {
    public int bitCounter(int x){
        //helper fxn to calculte no of 1's in binary of given integer - kernighan's algo
        int ct = 0;
        while(x != 0){
            x &= (x-1);
            ct++;
        }
        return ct;
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(bitCounter(h) + bitCounter(m) == turnedOn)
                   list.add(h + ":" + (m < 10 ? "0" + m : m));
            }
        }
        return list;
    }
}
