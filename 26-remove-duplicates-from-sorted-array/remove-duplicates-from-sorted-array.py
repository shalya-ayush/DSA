class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        counter  = 0
        for i in range(0, len(nums)-1):
            if nums[i] == nums[i+1]:
                counter = counter + 1
                nums[i] = 101

        nums.sort()
        return len(nums)-counter