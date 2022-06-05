class Solution:
    def arrayChange(self, nums: List[int], operations: List[List[int]]) -> List[int]:
        address=dict() #index:value
        numbers=dict() #numbers:index
        for i in range(len(nums)):
            address[i]=nums[i]
            numbers[nums[i]]=i
        for old,new in operations:
            index=numbers[old]
            numbers[new]=index
            del numbers[old]
            address[index]=new
        for i in range(len(nums)):
            nums[i]=address[i]
        return nums
        
        
            
            
        
        