#Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

#Leetcode : https://leetcode.com/problems/find-the-duplicate-number/

#Python Code :

class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
                return nums[i]
