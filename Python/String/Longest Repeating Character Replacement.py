#You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. 
#You can perform this operation at most k times.

#Return the length of the longest substring containing the same letter you can get after performing the above operations.

#leetcode : https://leetcode.com/problems/longest-repeating-character-replacement/

#python : 

def characterReplacement(self, s: str, k: int) -> int:
    start=0 
    dict={}
    maxL=0
    maxRepeatLetterCount=0
    for end in range(0,len(s)):
        ch=s[end]
        if ch not in dict:
            dict[ch]=0
        dict[ch]+=1
        maxRepeatLetterCount=max(maxRepeatLetterCount , dict[ch])
        if end-start+1-maxRepeatLetterCount>k:
            leftChar=s[start]
            dict[leftChar]-=1
            start+=1


        maxL=max(maxL , end-start+1)
    return maxL
