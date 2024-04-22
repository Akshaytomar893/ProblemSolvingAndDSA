#insert a node at the head of linked list

#hackerrank : https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

#python code :

def insertNodeAtHead(llist, data):
    # Write your code here
    node=SinglyLinkedListNode(data)
    node.next=llist
    llist=node
    return llist
