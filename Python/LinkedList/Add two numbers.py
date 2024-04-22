#You are given two non-empty linked lists representing two non-negative integers.
#The digits are stored in reverse order, and each of their nodes contains a single digit. 
#Add the two numbers and return the sum as a linked list.

#eg :
#l1 : 2->4->3
#l2 : 5->6->4
#output : 7->0->8

#leetcode : https://leetcode.com/problems/add-two-numbers/

#python code : 

def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    temp=ListNode(0)
    h=temp
    carry=0
    while l1 is not None and l2 is not None:
        sum=l1.val+l2.val+carry
        if sum>9:
            sum=sum-10
            carry=1
        else:
            carry=0
        a=ListNode(sum)
        temp.next=a
        temp=temp.next
        l1=l1.next
        l2=l2.next
    if l1 is not None:
        if carry==0:
            temp.next=l1
        else:
            while l1  is not None:
                sum=l1.val+carry
                if sum>9:
                    sum=sum-10
                    carry=1
                else:
                    carry=0
                    
                a=ListNode(sum)
                temp.next=a
                temp=temp.next
                l1=l1.next  
    if l2 is not None:
        if carry==0:
            temp.next=l2
        else:
            while l2  is not None:
                sum=l2.val+carry
                if sum>9:
                    sum=sum-10
                    carry=1
                else:
                    carry=0
                      
                a=ListNode(sum)
                temp.next=a
                temp=temp.next
                l2=l2.next  
    if carry ==1:
        a=ListNode(1)
        temp.next=a
        temp=temp.next
    return h.next
