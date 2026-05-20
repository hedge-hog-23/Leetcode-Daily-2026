class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        prefix = [0]*n

        temp_A = set()
        temp_B = set()

        for i in range(0,n):
            temp_A.add(A[i])
            temp_B.add(B[i])

            common_ct = 0
            for a in temp_A:
                if a in temp_B:
                    common_ct+=1

            prefix[i] = common_ct
        return prefix
