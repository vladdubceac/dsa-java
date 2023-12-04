package linked_list.exercises;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(1);
//        ll.insertNode(1);
//        ll.insertNode(4);
//        ll.insertNode(1);
//        ll.insertNode(5);
//        ll.insertNode(1);
        ll.traversalLL();
        Questions questions = new Questions();
        questions.deleteDups(ll);
        ll.traversalLL();
//        Node q = questions.nthToLast(ll, 2);
//        System.out.println(q.getValue());

        ll.createLL(1);
        ll.insertNode(9);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.traversalLL();
        questions.partition(ll,4);
        ll.traversalLL();
    }
}
