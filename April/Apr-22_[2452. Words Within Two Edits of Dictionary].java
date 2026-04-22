class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        def find_diff(str1,str2):
            ct = 0
            for i in range(0,len(str1)):
                if(str1[i] != str2[i]):
                    ct+=1
                    if ct == 3 :
                        return False
            return True


        res = []
        for q in queries:
            for d in dictionary:
                diff = find_diff(q,d)
                if diff:
                    res.append(q)
                    break
        return res
