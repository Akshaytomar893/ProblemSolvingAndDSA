# remove all the occurences of given element from the linked list

# leetcode : https://leetcode.com/problems/remove-linked-list-elements/

#python code:

def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        
    temp = ListNode(next=head)
       
    while temp.next and temp.next.val == val:
        temp.next = temp.next.next
    
    head = temp.next
      
    while head:
        while head.next and head.next.val == val:
            head.next = head.next.next
        head = head.next
            
    return temp.next
