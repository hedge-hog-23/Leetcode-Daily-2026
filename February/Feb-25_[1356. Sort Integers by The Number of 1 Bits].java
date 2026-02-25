class Solution {
    public int[] sortByBits(int[] arr) {
        Integer temp[] = new Integer[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int bitcta = Integer.bitCount(a);
            int bitctb = Integer.bitCount(b);

            if(bitcta == bitctb) 
                return a - b;
            return bitcta - bitctb;
        });

        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }

        return arr;
        // return temp;
    }
}
