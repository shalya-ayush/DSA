class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:

        max_one = 0
        res = 0


        for i in nums:
            if i == 1:
                max_one += 1
                res = max(res, max_one)
            else:
                max_one = 0

        return res

        