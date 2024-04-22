#Given two strings s and t, determine if they are isomorphic.

#Two strings s and t are isomorphic if the characters in s can be replaced to get t.

#All occurrences of a character must be replaced with another character while preserving the order of characters.
#No two characters may map to the same character, but a character may map to itself.

#leetcode : https://leetcode.com/problems/isomorphic-strings/

#python code : 

def isIsomorphic(self, s: str, t: str) -> bool:
    dic={}
    lis=[]
    l=len(s)
    for i in range(l):
        c1=s[i]
        c2=t[i]
        if c1 not in dic and c2 not in lis:
            dic[c1]=c2
            lis.append(c2)
        elif c1 in dic and dic[c1] !=c2:
            return False
        elif c1 not in dic and c2 in lis:
            return False
    return True
