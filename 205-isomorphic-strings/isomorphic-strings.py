class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}
        index = 0
        for i in s:
            if i in s_dict and s_dict[i] != t[index]:
                return False
            s_dict[i] = t[index]
            index += 1

        index = 0
        for i in t:
            if i in t_dict and t_dict[i] != s[index]:
                return False
            t_dict[i] = s[index]
            index += 1

        return True
        

        



        