#Print the preorder traversal of the given tree using python

#hackerrank : https://www.hackerrank.com/challenges/tree-preorder-traversal/problem

#python code :

def preOrder(root):
    #Write your code here
    if root is None:
        return
    else:
        print(root.info , end=' ')
        preOrder(root.left)
        preOrder(root.right)
