#print element of linked list i reverse order

#hackerrank : https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

#python code : 

def reversePrint(llist):
    # Write your code here
    if llist is None:
        return
    else:
        reversePrint(llist.next)
        print(llist.data)
