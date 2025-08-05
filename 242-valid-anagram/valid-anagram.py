class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_freq_map = {}
        t_freq_map = {}


        for i in s:
            s_freq_map[i] = 1 + s_freq_map.get(i, 0)

        for i in t:
            t_freq_map[i] = 1 + t_freq_map.get(i, 0)

        # /print(s_freq_map)
        # print(t_freq_map)

        if len(t_freq_map) != len(s_freq_map):
            return False

        for key, value in t_freq_map.items():
            if t_freq_map.get(key) != s_freq_map.get(key,0):
                return False
        
        
        return True

        