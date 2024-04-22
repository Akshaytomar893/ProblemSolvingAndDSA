#Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

#leetcode : https://leetcode.com/problems/valid-palindrome

#python code :

def isPalindrome(self, s: str) -> bool:
    s1=""
    for i in s:
           
        if i.isalnum():
            i=i.lower()
            s1+=i
    #print(s)
    if s1==s1[::-1]:
        return True
    else:
        return False
