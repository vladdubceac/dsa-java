package trees.linked_list_based;

public class Main {
    public static void main(String[] args) {
//        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
//        BinaryNode n1 = new BinaryNode();
//        n1.value = "N1";
//        BinaryNode n2 = new BinaryNode();
//        n2.value = "N2";
//        BinaryNode n3 = new BinaryNode();
//        n3.value = "N3";
//        BinaryNode n4 = new BinaryNode();
//        n4.value = "N4";
//        BinaryNode n5 = new BinaryNode();
//        n5.value = "N5";
//        BinaryNode n6 = new BinaryNode();
//        n6.value = "N6";
//        BinaryNode n7 = new BinaryNode();
//        n7.value = "N7";
//        BinaryNode n8 = new BinaryNode();
//        n8.value = "N8";
//        BinaryNode n9 = new BinaryNode();
//        n9.value = "N9";
//
//        n1.left = n2;
//        n1.right = n3;
//
//        n2.left = n4;
//        n2.right = n5;
//
//        n3.left = n6;
//        n3.right = n7;
//
//        n4.left = n8;
//        n4.right = n9;
//
//        binaryTreeLL.root=n1;
//
//        binaryTreeLL.preOrder(binaryTreeLL.root);
//        binaryTreeLL.inOrder(binaryTreeLL.root);
//        binaryTreeLL.postOrder(binaryTreeLL.root);
//        binaryTreeLL.levelOrder();
//
//        binaryTreeLL.search("N5");

        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("A1");
        binaryTree.insert("A2");
        binaryTree.insert("A3");
        binaryTree.insert("A4");
        binaryTree.insert("A5");
        binaryTree.insert("A6");
        binaryTree.levelOrder();

        BinaryNode deepestNode = binaryTree.getDeepestNode();
        System.out.println("\n"+deepestNode.value);

        binaryTree.deleteDeepestNode();
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.deleteNode("A3");
        System.out.println();
        binaryTree.levelOrder();

        System.out.println();
        binaryTree.deleteBinaryTree();
    }
}
