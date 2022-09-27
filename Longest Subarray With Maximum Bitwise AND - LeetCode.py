class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        count=0
        res=0
        Max=max(nums)
        for i in nums:
            if i==Max:
                count+=1
            else:
                count=0
                
            if(count>res):
                    res=count
                
            
           
        return res
            
        