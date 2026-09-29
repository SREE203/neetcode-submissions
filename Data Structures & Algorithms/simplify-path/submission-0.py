class Solution:
    def simplifyPath(self, path: str) -> str:
        ls = path.split('/')
        sl = []
        for l in ls:
            if l == '':
                continue
            elif l == '.':
                continue
            elif l == '..' and sl:
                sl.pop()
            elif l == '..':
                continue;
            else:
                sl.append(l)
        return '/'+'/'.join(sl)