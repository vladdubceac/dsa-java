package graphs.exercices.check_balanced;

public class CheckBalanced {
    public static int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight);
        }
    }

    public static boolean checkIfTreeIsBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public static boolean isBalanced(TreeNode treeNode) {
        boolean result = true;

        int leftHeight = treeNode.left != null ? treeNode.left.height() : 0;
        int rightHeight = treeNode.right != null ? treeNode.right.height() : 0;
        result = result && Math.abs(leftHeight - rightHeight) <= 1;

        while (treeNode.left != null || treeNode.right != null) {
            if (treeNode.left != null && treeNode.right == null) {
                result = result && isBalanced(treeNode.left);
            } else if (treeNode.left == null && treeNode.right != null) {
                result = result && isBalanced(treeNode.right);
            } else {
                result = result && isBalanced(treeNode.left) && isBalanced(treeNode.right);
            }

        }
        return result;
    }
}
