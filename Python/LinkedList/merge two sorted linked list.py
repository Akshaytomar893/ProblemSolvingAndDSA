# merge two sorted linked list into a single sorted linked list

#leetcode : https://leetcode.com/problems/merge-two-sorted-lists/

# python code:

def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    l3=ListNode()
    dummy=l3
    if l1 is None and l2 is None:
        return None
    if l1 is None:
        return l2
    if l2 is None:
        return l1
    while l1 is not None and l2 is not None:
        if l1.val < l2.val:
            a=ListNode(l1.val)
            l1=l1.next
        else:
            a=ListNode(l2.val)
            l2=l2.next
        dummy.next=a
        dummy=dummy.next
    if l1 is not None:
        dummy.next=l1
    elif l2 is not None:
        dummy.next=l2
    return l3.next
