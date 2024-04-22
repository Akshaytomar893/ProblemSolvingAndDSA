#Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

#Leetcode : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

#Python Code :

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        n=len(numbers)
        fp=0
        sp=n-1
        while fp<=sp:
            sum=numbers[fp]+numbers[sp]
            if sum==target:
                return[fp+1 , sp+1]
            elif sum<target:
                fp+=1
            else:
                sp-=1
