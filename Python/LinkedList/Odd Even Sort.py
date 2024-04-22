#Given a singly linked list , group all the nodes with odd position followed by all the nodes at even position
#eg:
#input : 1->2->3->4->5->6->7->8
#output: 1->3->5->7->2->4->6->8

#leetcode : https://leetcode.com/problems/odd-even-linked-list/

#python code :
def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    if head is None or head.next is None or head.next.next is None:
        return head
    ptr , odd , even= head ,head , head.next
    o=odd
    e=even
        
    while ptr is not None and ptr.next is not None:
        ptr=ptr.next.next
        if odd.next is not None and odd.next.next is not None:
            odd.next=odd.next.next
            odd=odd.next
        else:
            odd.next=None
        if even.next is not None and even.next.next is not None:
            even.next=even.next.next
            even=even.next
        else:
            even.next=None
            
            
    ptr=o
    while ptr.next is not None:
        ptr=ptr.next
    ptr.next=e
    return o
