class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        index_mapper = {}
        ret_list = []
        for index in range(len(nums)):
            complement = target - nums[index]
            if complement in index_mapper.keys():
                ret_list.append(index)
                ret_list.append(index_mapper.get(complement))
                break
            index_mapper[nums[index]] = index

        return ret_list

    
            


        