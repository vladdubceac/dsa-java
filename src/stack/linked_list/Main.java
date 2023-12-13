package stack.linked_list;

class Main {
  public static void main(String[] args) {
    Stack newStack = new Stack();
    boolean result = newStack.isEmpty();
    System.out.println(result);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);

    int resultNumber = newStack.pop();
    System.out.println(resultNumber);
//    resultNumber = newStack.pop();
//    System.out.println(resultNumber);

    int peek = newStack.peek();
    System.out.println("peek - "+peek);
    peek = newStack.peek();
    System.out.println("peek - "+peek);

    newStack.deleteStack();


  }
}
