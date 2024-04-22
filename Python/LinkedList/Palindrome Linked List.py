#Given a linked list , check whether it is palindrome or not

#leetcode: https://leetcode.com/problems/palindrome-linked-list

#python code :

class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow, fast=head, head
        pre=None
        if head is None or head.next is None:
            return True
        while fast is not None and fast.next is not None:
            pre=slow
            slow=slow.next
            fast=fast.next.next
        if fast is None:   
            h2=self.reverseList(slow)
        else:
            h2=self.reverseList(slow.next)
        pre.next=h2
        while h2 is not None:
            if head.val != h2.val:
                return False
            head=head.next
            h2=h2.next
        return True
            
        
        
        
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        pnode=None
        cnode=head
        
        while cnode is not None:
            nnode=cnode.next
            cnode.next=pnode
            pnode=cnode
            cnode=nnode
        
        head=pnode
        return head
