#Print the post order traversal of the given tree using python

#hackerrank : https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

#python code : 

def postOrder(root):
    #Write your code here
    if root is None:
        return
    else:
        
        postOrder(root.left)
        postOrder(root.right)
        print(root.info , end=' ')
