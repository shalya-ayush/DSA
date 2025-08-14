class Solution:
    def removeStars(self, s: str) -> str:
        ans = []

        for i in s:
            if i == "*" and ans:
                ans.pop()
            else:
                ans +=[i]

        return "".join(ans)
        