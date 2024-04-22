#Find the node of cycle formation in a linked list

#leetcode : https://leetcode.com/problems/linked-list-cycle-ii/

#python code :

def detectCycle(self, head: ListNode) -> ListNode:
    slow=head
    fast=head
    check=False
    if head is None:
        return None
    while fast is not None and fast.next is not None:
        slow=slow.next
        fast=fast.next.next
        if slow== fast:
            check =True
            break
    slow=head
    if check == False:
        return None
    while check:
        if slow==fast:
            return slow
        slow=slow.next
        fast=fast.next
