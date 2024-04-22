#Remove nth node from the end of a list

#leetcode link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

# python code:

def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
    a=head
    b=head
    if head is None:
        return None
    for _ in range(n):
        b=b.next
    if b is None:
        return head.next
    while b.next is not None:
        a=a.next
        b=b.next
    a.next=a.next.next
    return head
