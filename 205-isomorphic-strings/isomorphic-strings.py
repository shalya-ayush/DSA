class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}
        
        for i in range(len(s)):
            if s[i] not in s_dict:
                s_dict[s[i]] = i
            
            if t[i] not in t_dict:
                t_dict[t[i]] = i

            if s_dict[s[i]] != t_dict[t[i]]:
                return False

        
        return True
        

        



        