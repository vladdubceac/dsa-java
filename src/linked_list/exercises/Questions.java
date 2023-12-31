package linked_list.exercises;

import java.util.HashSet;
import java.util.Set;

public class Questions {
    public void deleteDups(LinkedList linkedList) {
        Set<Integer> nodeValues = new HashSet<>();
        Node node = linkedList.getHead();
        Node previous = null;
        while (node != null) {
            if (nodeValues.contains(node.getValue())) {
                previous.setNext(node.getNext());
                linkedList.decreaseSize();
            } else {
                nodeValues.add(node.getValue());
                previous = node;
            }
            node = node.getNext();
        }
        System.out.println();
    }

    public Node nthToLast(LinkedList linkedList, int nthToLast){
        Node p1 = linkedList.getHead();
        Node p2 = linkedList.getHead();
        for(int i=0;i<nthToLast;i++){
            if(p2==null){
                return null;
            }
            p2 = p2.getNext();
        }

        while (p2!=null){
            p1 = p1.getNext();
            p2 = p2.getNext();
        }

        return p1;

//        if(linkedList.getSize()==0){
//            return new Node();
//        }
//        else if(nthToLast>=linkedList.getSize()){
//            return linkedList.getHead();
//        }else{
//            Node node = linkedList.getHead();
//            for(int i=0;i<linkedList.getSize()-nthToLast;i++){
//                node = node.getNext();
//            }
//            return node;
//        }
    }

    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.getHead();
        ll.setTail(ll.getHead());
        while(currentNode!=null){
            Node next = currentNode.getNext();
            if(currentNode.getValue() < x){
                currentNode.setNext(ll.getHead());
                ll.setHead(currentNode);
            }else{
                ll.getTail().setNext(currentNode);
                ll.setTail(currentNode);
            }
            currentNode = next;
        }
        ll.getTail().setNext(null);
        return ll;
    }

    LinkedList sumLists(LinkedList llA, LinkedList llB){
        LinkedList sum = new LinkedList();
        Node nodeA = llA.getHead();
        Node nodeB = llB.getHead();

        int ten = 0;
        for(int i = 0; i < llA.getSize(); i++){
            int value = (nodeA.getValue() + nodeB.getValue());
            value = value % 10 + ten;
            if(sum.getSize()==0) {
                sum.createLL(value);
            }else{
                sum.insertNode(value);
            }
            ten = (nodeA.getValue() + nodeB.getValue())/10;
            nodeA = nodeA.getNext();
            nodeB = nodeB.getNext();
        }
        return sum;
    }

    // Intersection, kth Node
    Node getKthNode(Node head, int k){
        Node current = head;
        while(k>0 && current!=null){
            current = current.getNext();
            k--;
        }
        return current;
    }

    // Intersection method
    Node findIntersection(LinkedList list1, LinkedList list2){
        if(list1.getHead()==null || list2.getHead()==null)return null;
        if(list1.getTail()!=list2.getTail()){
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if(list1.getSize()>list2.getSize()){
            longer = list1.getHead();
            shorter = list2.getHead();
        }else{
            longer = list2.getHead();
            shorter = list1.getHead();
        }
        longer = getKthNode(longer, Math.abs(list1.getSize()-list2.getSize()));
        while(shorter!=longer){
            shorter = shorter.getNext();
            longer = longer.getNext();
        }
        return longer;
    }

    // Add same node
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue){
        Node newNode = new Node();
        newNode.setValue(nodeValue);
        llA.getTail().setNext(newNode);
        llA.setTail(newNode);
        llB.getTail().setNext(newNode);
        llB.setTail(newNode);
    }
}
