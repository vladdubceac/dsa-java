package trees.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    private BinaryNode root;

    public AVL() {
        root = null;
    }

    // Pre-order traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // In-order traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            System.out.println();
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRight());
    }

    // post-order traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            System.out.println();
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue());
    }

    // Level order
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }

    // Search method
    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value : " + value + " not found in AVL");
            return null;
        } else if (node.getValue() == value) {
            System.out.println("Value : " + value + " found in AVL");
            return node;
        } else if (value < node.getValue()) {
            return search(node.getLeft(), value);
        } else {
            return search(node.getRight(), value);
        }
    }
}
