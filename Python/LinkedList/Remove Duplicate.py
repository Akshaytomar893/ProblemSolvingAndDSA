#remove the repeating elements from the linked list

#leetcode : https://leetcode.com/problems/remove-duplicates-from-sorted-list/

#python code:

def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
    temp=head
    while temp is not None and temp.next is not None:
        if temp.val==temp.next.val:
            temp.next=temp.next.next
        else:
            temp=temp.next
    return head
