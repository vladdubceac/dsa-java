package trees.binary_search_trees;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        BinaryNode newNode = new BinaryNode();
        if (currentNode == null) {
            newNode.setValue(value);
            System.out.println("The value successfully inserted");
            return newNode;
        } else if (value <= currentNode.getValue()) {
            newNode = insert(currentNode.getLeft(), value);
            currentNode.setLeft(newNode);
            return currentNode;
        }else {
            newNode = insert(currentNode.getRight(),value);
            currentNode.setRight(newNode);
            return currentNode;
        }
    }

    void insert(int value){
        insert(root, value);
    }
}
