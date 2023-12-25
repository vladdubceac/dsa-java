package data_structures_tasks.stack_of_plates;

public class StackNode {
    public StackNode above;
    public StackNode below;
    public int value;

    public StackNode(int value){
        this.value = value;
    }
}
