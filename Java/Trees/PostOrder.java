package Java.Trees;

import java.util.ArrayList;
import java.util.List;


public class PostOrder {
    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        else {
            traverse(root.left, list);
            traverse(root.right, list);
            list.add(root.val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<Integer>();
        traverse(root, postOrder);
        return postOrder;
    }
}
