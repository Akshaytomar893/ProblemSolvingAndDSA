package Java.Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {

    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            list.add(root.val);
            traverse(root.left, list);
            traverse(root.right, list);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<Integer>();
        traverse(root, preOrder);
        return preOrder;

    }
}
