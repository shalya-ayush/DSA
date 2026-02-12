class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        freq_dict = {}
        for num in nums:
            freq_dict[num] = freq_dict.get(num, 0) + 1

        
        for key, value in freq_dict.items():
            if freq_dict.get(key) >=2:
                return True
            
        return False
        