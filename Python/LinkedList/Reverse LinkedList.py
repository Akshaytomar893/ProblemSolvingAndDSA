#Reverse a given singly linked list
#eg: 
#input : 1->2->3->4->5
#output: 5->4->3->2->1

#leetcode : https://leetcode.com/problems/reverse-linked-list/

#python code: 

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
