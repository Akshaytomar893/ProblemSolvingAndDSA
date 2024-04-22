#Given a string in roman form....convert it into integer form

#leetcode: https://leetcode.com/problems/roman-to-integer

#python code :

def romanToInt(self, s: str) -> int:
    dic={'I':1 , 'V':5 , 'X':10 ,'L':50 ,'C':100 ,'D':500 ,'M':1000}
    t = s.replace('IV', 'IIII').replace('IX', 'VIIII').replace('XL', 'XXXX').replace('XC', 'LXXXX').replace('CD', 'CCCC').replace('CM', 'DCCCC')
    ans=0
    for i in t:
        if i in dic:
            ans+=dic[i]
    return ans
