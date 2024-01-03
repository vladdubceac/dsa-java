package trees.array_based;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Binary Tree of size " + size + " has been created!");
    }

    // isFull
    boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    // insert method
    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The Binary Tree is full");
        }
    }

    // preOrder Traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    // in-order traversal
    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(2*index);
        System.out.print(arr[index]+" ");
        inOrder(2*index+1);
    }

    // post-order traversal
    public void postOrder(int index){
        if(index>lastUsedIndex){
            return;
        }
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.print(arr[index]+" ");
    }

    // level-order traversal
    public void levelOrder(){
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // search method
    public int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.println(value + " exists at the location : "+i);
                return i;
            }
        }
        System.out.println("The value does not exist in Binary Tree");
        return -1;
    }

    // Delete Method
    public void delete(String value){
        int location = search(value);
        if(location==-1){
            return;
        }else{
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node successfully deleted");
        }
    }
}
