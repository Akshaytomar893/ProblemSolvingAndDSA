#detect whether a linked list contain a cloased loop or not

# leetcode : https://leetcode.com/problems/linked-list-cycle/

# python code:

def hasCycle(self, head: ListNode) -> bool:
    slow=head
    fast=head
    if head is None:
        return False
    while fast is not None and fast.next is not None:
        slow=slow.next
        fast=fast.next.next
        if slow== fast:
            return True
    return False
