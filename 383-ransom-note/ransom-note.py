class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:

        ransomNoteMap = {}
        magazineMap = {}

        for i in range(len(ransomNote)):
            if ransomNote[i] in ransomNoteMap:
                # print(ransomNoteMap.get(ransomNote[i]) + 1)
                ransomNoteMap.update({ransomNote[i]:ransomNoteMap.get(ransomNote[i]) +1})
            else:
                ransomNoteMap.update({ransomNote[i]:1})
        
        for i in range(len(magazine)):
            if magazine[i] in magazineMap:
                # pass
                magazineMap.update({magazine[i]:magazineMap.get(magazine[i])+1})
            else:
                magazineMap.update({magazine[i]:1})
        
        # Compare 2 dictionaries of different length
    #    / print(ransomNoteMap)
        # print(magazineMap)
        common_keys = ransomNoteMap.keys() & magazineMap.keys()
        print(common_keys)

        if not common_keys or len(common_keys) < len(ransomNoteMap.keys()):
            return False
        
        for key in common_keys:
            if ransomNoteMap[key] > magazineMap[key]:
                return False

        return True



        