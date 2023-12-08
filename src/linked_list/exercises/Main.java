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
//        ll.traversalLL();
        Questions questions = new Questions();
        questions.deleteDups(ll);
//        ll.traversalLL();
//        Node q = questions.nthToLast(ll, 2);
//        System.out.println(q.getValue());

//        ll.createLL(1);
//        ll.insertNode(9);
//        ll.insertNode(5);
//        ll.insertNode(10);
//        ll.insertNode(2);
//        ll.traversalLL();
//        questions.partition(ll,4);
//        ll.traversalLL();

        LinkedList listA = new LinkedList();
        listA.createLL(7);
        listA.insertNode(1);
        listA.insertNode(6);
        listA.traversalLL();

        LinkedList listB = new LinkedList();
        listB.createLL(5);
        listB.insertNode(9);
        listB.insertNode(2);
        listB.traversalLL();
//        list1 = 7 -> 1 -> 6
//        list2 =  5 -> 9 -> 2
        LinkedList sumList = questions.sumLists(listA,listB);
        sumList.traversalLL();

        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);

        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);

        Questions q =new Questions();
        q.addSameNode(llA,llB,7);
        q.addSameNode(llA,llB,2);
        q.addSameNode(llA,llB,1);

        Node inter = q.findIntersection(llA,llB);
        System.out.println(inter.getValue());
    }
}
