class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        ct = 0
        for i in range(num1,num2+1):
            tp = str(i)
            if(len(tp) < 3):
                continue
            for j in range(1,len(tp)-1):
                if((tp[j] > tp[j+1] and tp[j] > tp[j-1]) or (tp[j] < tp[j+1] and tp[j] < tp[j-1])):
                    ct+=1
        return ct
