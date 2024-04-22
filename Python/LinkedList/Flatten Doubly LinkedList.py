#Flatten a multilevel doubly linked list with child nodes into a singly level doubly linked list
#eg:
#Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
#Output: [1,2,3,7,8,11,12,9,10,4,5,6]

#leetcode : https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/


#python code :

def flatten(self, head: 'Node') -> 'Node':
    if head is None:
        return None
    temp=head
    while temp is not None:
        nnode=temp.next
        if temp.child is not None:
            abc=self.flatten(temp.child)
            temp.child=None
            temp.next=abc
            abc.prev=temp
            while temp.next is not None:
                temp=temp.next
            temp.next=nnode
            if nnode is not None:
                nnode.prev=temp
            temp=nnode
        else:
            temp=temp.next
    return head
