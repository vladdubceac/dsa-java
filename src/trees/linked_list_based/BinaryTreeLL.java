package trees.linked_list_based;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    // Preorder Traversal
    void preOrder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-order traversal
    public void inOrder(BinaryNode node) {
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}
