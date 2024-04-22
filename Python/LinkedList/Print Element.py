#print element of a linked list

#hackerrank : https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem

#python code :
 
def printLinkedList(head):
    while head is not None:
        print(head.data)
        head=head.next
