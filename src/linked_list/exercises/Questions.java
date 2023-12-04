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
}
