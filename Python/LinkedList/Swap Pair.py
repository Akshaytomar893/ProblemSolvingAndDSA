#swap nodes in pair of a linked list
#eg : 
#input: 1->2->3->4->5->6->7
#output: 2->1->4->3->6->5->7

#Leetcode : https://leetcode.com/problems/swap-nodes-in-pairs/

#Python Code: 

def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
    if head is None or head.next is None:
        return head
    pnode=head
    cnode=head.next
    head=cnode
    while True:
        nnode=cnode.next
        cnode.next=pnode
        if nnode is None or nnode.next is None:
            pnode.next=nnode
            break
        pnode.next=nnode.next
         
        pnode=nnode
        cnode=pnode.next
         
    return head
