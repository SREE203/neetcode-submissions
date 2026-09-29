class Solution:
    def simplifyPath(self, path: str) -> str:
        ls = path.split('/')
        sl = []
        for l in ls:
            if l == '' or l == '.':
                continue
            elif l == '..':
                if sl:
                    sl.pop()
            else:
                sl.append(l)
        return '/'+'/'.join(sl)