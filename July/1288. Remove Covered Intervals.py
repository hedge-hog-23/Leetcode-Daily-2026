class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:

        intervals.sort(key=lambda x: (x[0], -x[1]))
        '''sorted based on start and end element 
        [[1,4],[3,6],[2,8]] to [[1,4],[2,8],[3,6]] (if start element is same, then -x[i] in asc. order like [[2,8],[2,6]])
        '''
        ct = 0
        maxi = 0
        for st,ed in intervals:
            if(ed > maxi):
                ct+=1
                maxi = ed
        return ct
