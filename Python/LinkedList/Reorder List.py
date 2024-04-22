#You are given the head of a singly linked-list. The list can be represented as:
  #L0 → L1 → … → Ln - 1 → Ln
#Reorder the list to be on the following form:
  #L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

#leetcode : https://leetcode.com/problems/reorder-list

#Python Code :

import collections
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        if head is None or head.next is None or head.next.next is None:
            pass
        
        q=collections.deque()
        prev=head
        while prev is not None:
            q.append(prev.val)
            prev=prev.next
        prev=head
        for _ in range(len(q)//2):
            prev.val=q.popleft()
            prev=prev.next
            prev.val=q.pop()
            prev=prev.next
        if q:
            prev.val=q.pop()
            prev=prev.next
