#Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
  #Integers in each row are sorted from left to right.
  #The first integer of each row is greater than the last integer of the previous row.
  
#leetcode : https://leetcode.com/problems/search-a-2d-matrix/

#python code : 

def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    r=len(matrix)
    c=len(matrix[0])
       
    i=0
    while i<r and target>matrix[i][c-1]:
        i+=1
    #print(i)
    if i ==  r:
        return False
    j=c-1
    while j>=0:
        if matrix[i][j]==target:
            return True
        j-=1
    return False
