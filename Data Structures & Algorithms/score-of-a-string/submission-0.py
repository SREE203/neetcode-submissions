class Solution:
    def scoreOfString(self, s: str) -> int:
        prev = s[0]
        su = 0
        for l in s:
            su += abs(ord(l)-ord(prev))
            prev = l
        return su