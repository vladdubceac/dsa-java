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
}
