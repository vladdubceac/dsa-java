package trees.binary_search_trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        BinaryNode newNode;
        if (currentNode == null) {
            newNode = new BinaryNode();
            newNode.setValue(value);
            return newNode;
        } else if (value <= currentNode.getValue()) {
            newNode = insert(currentNode.getLeft(), value);
            currentNode.setLeft(newNode);
            return currentNode;
        } else {
            newNode = insert(currentNode.getRight(), value);
            currentNode.setRight(newNode);
            return currentNode;
        }
    }

    void insert(int value) {
        if (root == null) {
            root = insert(null, value);
        } else {
            insert(root, value);
        }
    }

    // pre-order traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // in-order traversal
    void inOrder(BinaryNode node){
        if(node==null){
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue()+" ");
        inOrder(node.getRight());
    }

    // post-order traversal
    void postOrder(BinaryNode node){
        if(node==null){
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue()+" ");
    }

    // Level order
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        if(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue()+" ");
            if(presentNode.getLeft()!=null){
                queue.add(presentNode.getLeft());
            }
            if(presentNode.getRight()!=null){
                queue.add(presentNode.getRight());
            }
        }
    }

    public BinaryNode getRoot() {
        return root;
    }
}
