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

        newBST.preOrder(newBST.getRoot());
        System.out.println();
        newBST.inOrder(newBST.getRoot());
        System.out.println();
        newBST.postOrder(newBST.getRoot());
    }
}
