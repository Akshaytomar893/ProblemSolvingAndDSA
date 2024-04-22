#delete node from given position of the linked list

#hackerrank : https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

#python code:

def deleteNode(llist, position):
    # Write your code here
    temp = llist
    if position == 0:
        return temp.next

    while position - 1 > 0:
        llist = llist.next
        position -= 1
    llist.next = llist.next.next
    return temp
