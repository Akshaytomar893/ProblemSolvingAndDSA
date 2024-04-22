#rotate the given linked list to right by k places
#eg: 
#input : 1->2->3->4->5 , k=2
#output : 4->5->1->2->3

#leetcode : https://leetcode.com/problems/rotate-list/

#python code : 

def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
    temp=head
    len=0
    if head is None or head.next is None:
        return head
    while temp is not None:
        len+=1
        temp=temp.next
    temp=head
    k=k%len
    if k ==0:
        return head
       
    head=head.next
    phead=temp
    for i in range(len-k-1):
        phead=phead.next
        head=head.next
    phead.next=None
    temp2=head
    while temp2.next is not None:
        temp2=temp2.next
    temp2.next=temp
       
    return head
