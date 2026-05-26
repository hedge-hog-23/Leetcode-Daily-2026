class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        ct=0
        temp = set(word)
        for c in string.ascii_lowercase:
            if(c in temp and c.upper() in temp):
                ct+=1
        return ct
        
