package stack.linked_list;

public class Stack {
  LinkedList linkedList;

  public Stack() {
    linkedList = new LinkedList();
  }

  // Push method
  public void push(int value) {
    linkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted " + value + " in Stack");
  }

  // isEmpty
  public boolean isEmpty() {
    if (linkedList.getHead() == null) {
      return true;
    } else {
      return false;
    }
  }

  // Pop method
  public int pop() {
    int result = Integer.MIN_VALUE;
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
    } else {
      result = linkedList.getHead().getValue();
      linkedList.deletionOfNode(0);
    }
    return result;
  }

  // Peek Method
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
      return Integer.MIN_VALUE;
    } else {
      return linkedList.getHead().getValue();
    }
  }

  // Delete Method
  public void deleteStack() {
    linkedList.setHead(null);
    System.out.println("The Stack is deleted");
  }
}
