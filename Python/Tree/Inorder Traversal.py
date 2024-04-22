#print the inorder traversal of the given tree

#hackerrank : https://www.hackerrank.com/challenges/tree-inorder-traversal/problem

#python code : 

def inOrder(root):
    #Write your code here
    if root is None:
        return
    else:
        inOrder(root.left)
        print(root.info , end=' ')
        inOrder(root.right)
