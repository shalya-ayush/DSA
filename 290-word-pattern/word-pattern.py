class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_list = s.split(" ")

        if len(pattern) != len(s_list):
            return False

        pattern_dict = {}
        for i in range(len(s_list)):
            if pattern[i] in pattern_dict and pattern_dict[pattern[i]] != s_list[i]:
                return False
            pattern_dict[pattern[i]] = s_list[i]

        s_dict = {}
        index = 0
        for i in range(len(s_list)):
            if s_list[i] in s_dict and s_dict[s_list[i]] != pattern[i]:
                return False
            s_dict[s_list[i]] = pattern[i]

        print(s_dict)
 
        return True