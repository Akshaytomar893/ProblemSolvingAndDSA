#Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


#Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
#Output: 6

#leetcode : https://leetcode.com/problems/trapping-rain-water/

#python code : 

def trap(self, height: List[int]) -> int:
    le=int(len(height))
    l=[0]
    r=[0]
    lmax, rmax=0,0
    for i in range(1,le):
        lmax=max(lmax , height[i-1])
        rmax=max(rmax , height[le-i])
        l.append(lmax)
        r.append(rmax)
    ans=0
    r=r[::-1]
    for i in range(le):
        a=(min(l[i] , r[i])-height[i])
        if a>0:
            ans+=a
    return ans
