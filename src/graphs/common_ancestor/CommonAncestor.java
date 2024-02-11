package graphs.common_ancestor;

public class CommonAncestor {
    public static TreeNode commonAncestor(TreeNode root, TreeNode childNode1, TreeNode childNode2) {
        if (childNode1 == null || childNode2 == null) {
            return null;
        }

        if (childNode1 == root || childNode2 == root) {
            return root;
        }
        TreeNode parent1 = childNode1.parent;
        while (parent1 != null) {
            TreeNode parent2 = childNode2.parent;
            while (parent2 != null) {
                if (parent1 == parent2) {
                    return parent1;
                }
                parent2 = parent2.parent;
            }
            parent1 = parent1.parent;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 1, 9, 11};
        TreeNode root = new TreeNode(20);
        for (int a : array) {
            root.insertInOrder(a);
        }
        TreeNode n1 = root.find(1);
        TreeNode n9 = root.find(9);
        TreeNode ancestor = CommonAncestor.commonAncestor(root, n1, n9);
        System.out.println(ancestor.data);
    }
}
