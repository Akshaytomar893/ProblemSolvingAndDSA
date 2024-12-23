package Java.Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        else {
            traverse(root.left, list);
            list.add(root.val);
            traverse(root.right, list);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<Integer>();
        traverse(root, postOrder);
        return postOrder;
    }
}
