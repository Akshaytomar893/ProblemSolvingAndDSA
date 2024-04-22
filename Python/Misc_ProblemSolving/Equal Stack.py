"""You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. 
You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. 
This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

Eg : 
  h1=[1,2,1,1]
  h2=[1,1,2]
  h3=[1,1]
  
  There are 4,3 and 2 cylinders in the three stacks, with their heights in the three arrays.
  Remove the top 2 cylinders from h1 (heights = [1, 2]) and from h2 (heights = [1, 1]) so that the three stacks all are 2 units tall. Return 2 as the answer."""

#hackerrank : https://www.hackerrank.com/challenges/equal-stacks/problem

#python code :

def equalStacks(h1, h2, h3):
    # Write your code here
    s1, s2, s3 = map(sum, (h1, h2, h3))
    while h1 and h2 and h3:
        m = min(s1, s2, s3)
        while s1 > m: s1 -= h1.pop(0)
        while s2 > m: s2 -= h2.pop(0)
        while s3 > m: s3 -= h3.pop(0)
        if s1 == s2 == s3: return s1
    return 0
