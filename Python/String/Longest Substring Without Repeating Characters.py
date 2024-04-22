#find the length of longest substring without repeating character from given string

#leetcode : https://leetcode.com/problems/longest-substring-without-repeating-characters/

#python code:

def lengthOfLongestSubstring(self, s: str) -> int:
    start=0 
    dict={}
    maxL=0
    for end in range(0,len(s)):
        ch=s[end]
        if ch in dict:
            start=max(start , dict[ch]+1)
        dict[ch]=end
        maxL=max(maxL , end-start+1)
    return maxL
