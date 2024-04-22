#Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

#leetcode : https://leetcode.com/problems/two-sum/

#Python Code :

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        dic={}
        for i in range(n):
            if target-nums[i] in dic:
                return [dic[target-nums[i]],i]
            else:
                dic[nums[i]]=i
