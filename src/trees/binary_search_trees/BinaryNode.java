package trees.binary_search_trees;

public class BinaryNode {
    private int value;
    private int height;
    private BinaryNode left;
    private BinaryNode right;

    public int getValue() {
        return value;
    }

    public int getHeight() {
        return height;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
