class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        unique_list = set(nums)
        nums = list(unique_list)

        nums.sort()
        count = 0
        cntr_list = []
        
        if len(nums) == 0:
            return count
        for i in range(len(nums)-1):
            if nums[i+1] - nums[i] == 1:
                count +=1

            else:
                cntr_list.append(count)
                count = 0
        cntr_list.append(count)


        return max(cntr_list) +1

        # return count+1

        