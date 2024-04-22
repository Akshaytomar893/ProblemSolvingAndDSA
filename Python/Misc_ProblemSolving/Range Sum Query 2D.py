#Given a 2D matrix matrix, handle multiple queries of the following type:
  # Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

#Leetcode : https://leetcode.com/problems/range-sum-query-2d-immutable/

#Python Code:

class NumMatrix:

    def __init__(self, matrix: List[List[int]]):
        m,n=len(matrix) , len(matrix[0])
        r1,c1,r2,c2=1,2,2,4
        self.matrix=matrix
        self.presum = [[0 for _ in range(n)] for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if i==0 and j==0:
                    self.presum[i][j]=self.matrix[i][j]
                elif i==0:
                    self.presum[i][j]=matrix[i][j]+self.presum[i][j-1]
                elif j==0:
                    self.presum[i][j]=matrix[i][j]+self.presum[i-1][j]
                else:
                    self.presum[i][j]=matrix[i][j]-self.presum[i-1][j-1]+self.presum[i-1][j]+self.presum[i][j-1]

    def sumRegion(self, row1: int, col1: int, row2: int, col2: int) -> int:
        if row1==0 and col1==0:
            ans=self.presum[row2][col2]
        elif row1==0:
            ans=self.presum[row2][col2]-self.presum[row2][col1-1]
        elif col1==0:
            ans=self.presum[row2][col2]-self.presum[row1-1][col2]
        else:
            ans=self.presum[row2][col2]-self.presum[row2][col1-1]-self.presum[row1-1][col2]+self.presum[row1-1][col1-1]
        return ans
