class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i >= 0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // for inputs like [9,9,9] above code will return [0,0,0] to add 1 in front we do this :
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
        
    }
}
