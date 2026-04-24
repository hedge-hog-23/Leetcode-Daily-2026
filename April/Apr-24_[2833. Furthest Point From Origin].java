class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        dist = 0
        temp = 0
        for char in moves:
            if char == "R":
                dist+=1
            elif char == "L":
                dist-=1
            else:
                temp+=1
        return abs(dist) + temp

