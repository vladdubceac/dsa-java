package graphs.exercices.check_bst;

public class ValidateBST {
    public static Integer lastPrinted = null;

    public static boolean checkBST(TreeNode node) {
        return checkBST(node, true);
    }

    // Allow "equal" value only for left child. This validates the BST property.
    public static boolean checkBST(TreeNode treeNode, boolean isLeft) {
        if (treeNode == null) {
            return true;
        }

        if (!checkBST(treeNode.left, true)) {
            return false;
        }

        if (lastPrinted != null) {
            if (isLeft) {
                if (treeNode.data < lastPrinted) {
                    return false;
                }
            } else {
                if (treeNode.data <= lastPrinted) {
                    return false;
                }
            }
        }
        lastPrinted = treeNode.data;

        if(!checkBST(treeNode.right,false)){
            return false;
        }
        return true;
    }
}
