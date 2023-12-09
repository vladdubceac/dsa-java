package linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
//        System.out.println(sll.getHead().getValue());
        sll.insertInLinkedList(6, 1);
        sll.insertInLinkedList(7, 3);
        sll.insertInLinkedList(8, 4);
        sll.insertInLinkedList(9, 0);
        sll.traversalSinglyLinkedList();
//        System.out.println(sll.getHead().getNext().getNext().getValue());
        sll.searchNode(7);
        sll.searchNode(10);

        sll.deletionOfNode(3);
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(0);
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(sll.getSize());
        sll.traversalSinglyLinkedList();
        sll.deletionOfNode(0);
        sll.traversalSinglyLinkedList();
        sll.insertInLinkedList(1, 0);
        sll.insertInLinkedList(5, 1);
        sll.insertInLinkedList(2, 2);
        sll.insertInLinkedList(3, 3);
        sll.insertInLinkedList(4, 4);
        sll.traversalSinglyLinkedList();
        sll.deleteSLL();
        sll.traversalSinglyLinkedList();

        System.out.println("----------------");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);
        singlyLinkedList.push(10);

        int value = singlyLinkedList.pop().getValue();
        System.out.println(value);
        System.out.println("size = " + singlyLinkedList.getSize());

        value = singlyLinkedList.pop().getValue();
        System.out.println(value);
        System.out.println("size = " + singlyLinkedList.getSize());
        singlyLinkedList.pop();

        System.out.println("-------------------");
        singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5) ; // Success
        singlyLinkedList.push(10) ; // Success
        singlyLinkedList.push(15) ; // Success
        singlyLinkedList.push(20) ; // Success
        singlyLinkedList.push(25) ; // Success

        String s = singlyLinkedList.rotate(3);
//        System.out.println(s);

        System.out.println(singlyLinkedList.getHead().getValue());  // 20
        System.out.println(singlyLinkedList.getHead().getNext().getValue());   // 25
        System.out.println(singlyLinkedList.getHead().getNext().getNext().getValue());  // 5
        System.out.println(singlyLinkedList.getHead().getNext().getNext().getNext().getValue()); // 10
        System.out.println(singlyLinkedList.getHead().getNext().getNext().getNext().getNext().getValue()); // 15
        System.out.println(singlyLinkedList.getTail().getValue()); // 15

        System.out.println("------------------------");
        singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(1);
        singlyLinkedList.push(2);

        singlyLinkedList.set(0,10);  // True
        singlyLinkedList.set(1,20);  // True
        int num = singlyLinkedList.getHead().getValue();  // 10
        System.out.println(num);
        num = singlyLinkedList.getHead().getNext().getValue(); // 20
        System.out.println(num);

        System.out.println("-------------------------");
        singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);  // Success
        singlyLinkedList.push(10);  // Success
        singlyLinkedList.push(15);  // Success
        singlyLinkedList.push(20);  // Success
        singlyLinkedList.push(25); // Success
        num = singlyLinkedList.remove(2).getValue(); // 15
        System.out.println(num);

        Node deleted = singlyLinkedList.remove(100); // null
        System.out.println(deleted);

        num =singlyLinkedList.getSize();
        System.out.println(num);

        num = singlyLinkedList.remove(2).getValue();   // 4
        System.out.println(num);

        num = singlyLinkedList.getHead().getValue();   // 5
        System.out.println(num);

        num = singlyLinkedList.getHead().getNext().getValue(); // 10
        System.out.println(num);

        num = singlyLinkedList.getHead().getNext().getNext().getValue(); // 20
        System.out.println(num);
    }
}
