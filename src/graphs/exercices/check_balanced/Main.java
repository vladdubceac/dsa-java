package graphs.exercices.check_balanced;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createMinimalBST(new int[]{1,2,3,4,5,6,7,8,9,10,});

        boolean isBalanced = CheckBalanced.isBalanced(treeNode);
        System.out.println(treeNode + " is balanced "+isBalanced);

    }
}
