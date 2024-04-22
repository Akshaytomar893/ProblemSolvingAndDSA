#Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

#Leetcode : https://leetcode.com/problems/find-all-duplicates-in-an-array/

#Python Code ::

class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        dic={}
        for i in nums:
            if i not in dic:
                dic[i]=0
            dic[i]+=1
        ans=[]
        for key , value in dic.items():
            if value>1:
                ans.append(key)
        return ans
