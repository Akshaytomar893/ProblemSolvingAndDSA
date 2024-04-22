#Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
#Return the decimal value of the number in the linked list.
#eg:
#input  : 1->0->1
#output : 5

#leetcode : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

#python code:

def getDecimalValue(self, head: ListNode) -> int:
    len=0
    temp=head
    while temp is not None:
        temp=temp.next
        len+=1
    i=len-1
    ans=0
    while head is not None:
        ans+=(head.val*(2**i))
        head=head.next
        i-=1
    return ans
