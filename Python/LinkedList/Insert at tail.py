#insert a node at tail of linked list

#hackerrank : https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

#python code:

def insertNodeAtTail(head, data):
    newnode=SinglyLinkedListNode(data)
    if head == None:
        head = newnode
    else:
        current = head
        while current.next != None:
            current = current.next
        current.next = newnode
    return head
