package trees.binary_search_trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.insert(85);

//        newBST.preOrder(newBST.getRoot());
//        System.out.println();
//        newBST.inOrder(newBST.getRoot());
//        System.out.println();
//        newBST.postOrder(newBST.getRoot());

//        newBST.levelOrder();
//        newBST.search(40);
//        newBST.search(45);

//        newBST.search(newBST.getRoot(), 40);
//        newBST.search(newBST.getRoot(), 45);
//        newBST.levelOrder();
//        System.out.println();
//        newBST.deleteNode(newBST.getRoot(),40);
//        newBST.deleteNode(newBST.getRoot(),80);
//        newBST.deleteNode(newBST.getRoot(),90);
        newBST.deleteBST();
        newBST.levelOrder();
    }

}
