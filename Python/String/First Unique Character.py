#Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

#leetcode : https://leetcode.com/problems/first-unique-character-in-a-string/

#python code : 

def firstUniqChar(self, s: str) -> int:
    dic={}
    for i in s:
        if i not in dic:
            dic[i]=0
        dic[i]+=1
    j=0
    for j in range(len(s)):
        if dic[s[j]]==1:
            return j
    return -1
