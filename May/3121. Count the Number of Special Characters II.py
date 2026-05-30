class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lower_arr = [-1] * 26
        upper_arr = [-1] * 26

        for idx,ch in enumerate(word):
            if ch.islower():
                lower_arr[ord(ch) - ord('a')] = idx
            else:
                if(upper_arr[ord(ch) - ord('A')] == -1):
                    upper_arr[ord(ch) - ord('A')] = idx
            
        ct = 0
        for i in range(0,26):
            if(lower_arr[i] != -1 and upper_arr[i]!=-1):
                if(lower_arr[i] < upper_arr[i]):
                    ct+=1
        return ct
