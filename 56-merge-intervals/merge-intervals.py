class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        merged = []
        intervals.sort(key=lambda x: x[0])

        prev = intervals[0]

        # If current starting time is less than ending time in previous interval, they are overlapping. 
        

        for interval in intervals[1:]:
            if interval[0] <= prev[1]:
                prev[1] = max(prev[1], interval[1])

            else:
                merged.append(prev)
                prev = interval
            
        merged.append(prev)

        return merged
        