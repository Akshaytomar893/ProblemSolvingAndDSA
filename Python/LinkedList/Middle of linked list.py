#find the middle node of the linked list and if the linked list have two middle node return the second one

#leetcode : https://leetcode.com/problems/middle-of-the-linked-list/

#python code :

def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
    slow,fast=head,head
    while fast is not None and fast.next is not None:
        slow=slow.next
        fast=fast.next.next
       
    return slow
