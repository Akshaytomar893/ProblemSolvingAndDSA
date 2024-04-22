#Given an integer array nums, handle multiple queries of the following type:
  #Calculate the sum of the elements of nums between indices left and right inclusive where left <= right
  
#leetcode : https://leetcode.com/problems/range-sum-query-immutable/

#Python Code :

class NumArray:

    def __init__(self, nums: List[int]):
        self.nums=nums
        self.presum=[]
        sum=0
        for i in nums:
            sum+=i
            self.presum.append(sum)

    def sumRange(self, left: int, right: int) -> int:
        if left==0:
            ans=self.presum[right]
        else:
            ans=self.presum[right]-self.presum[left-1]
        return ans
