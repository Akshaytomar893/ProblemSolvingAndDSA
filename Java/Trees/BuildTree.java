package Java.Trees;

//Build a tree and return root , when the inOrder and preOrder is given

public class BuildTree {
    int findIndex(int[] arr, int ele, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode makeTree(int[] pre, int[] in, int preStart, int inStart, int inEnd){
        if(inStart > inEnd ){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int posInInorder = findIndex(in, root.val, inStart, inEnd);
        root.left = makeTree(pre, in, preStart+1, inStart, posInInorder -1);
        root.right = makeTree(pre, in , preStart + posInInorder - inStart + 1, posInInorder +1, inEnd);
        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return makeTree(preorder, inorder, 0, 0, inorder.length-1);
    }
}
