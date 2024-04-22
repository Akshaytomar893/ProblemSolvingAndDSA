#You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
#We repeatedly make duplicate removals on s until we no longer can.

#Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

#leetcode : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

#python code : 

def removeDuplicates(self, s: str) -> str:
    l=[]
    for i in s:
        if l and i==l[-1]:
            l.pop()
        else:
            l.append(i)
               
    ans="".join(l)
    return ans
