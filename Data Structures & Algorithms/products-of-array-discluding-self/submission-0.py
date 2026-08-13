class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        ret = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i!=j:
                    p*=nums[j]
            ret.append(p)
            p = 1

        return ret