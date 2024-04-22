#Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

#leetcode : https://leetcode.com/problems/length-of-last-word/

#python code :

def lengthOfLastWord(self, s: str) -> int:
    return len(((s.strip()).split(" ")[-1]).strip())
