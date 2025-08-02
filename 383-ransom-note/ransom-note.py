class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:

        # Create a hashmap for magazine
        magazine_hash = {}
        for i in magazine:
            magazine_hash[i] = 1 + magazine_hash.get(i,0)

        # Now iterate over ransomeNote string and subtract the value of chracter from the 
        # magazine hash dictionary if the the character exists in the magazine_hash
        # dictionary
        for i in ransomNote:
            if i not in magazine_hash or magazine_hash[i] <= 0:
                return False
            
            magazine_hash[i] -=1

        
        return True


        