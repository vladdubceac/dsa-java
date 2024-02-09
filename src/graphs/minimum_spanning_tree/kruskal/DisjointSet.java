package graphs.minimum_spanning_tree.kruskal;

import graphs.minimum_spanning_tree.kruskal.WeightedNode;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    private List<WeightedNode> nodeList = new ArrayList<>();

    public static void makeSet(List<WeightedNode> nodeList) {
        for (WeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.setSet(set);
        }
    }

    public static DisjointSet findSet(WeightedNode node) {
        return node.getSet();
    }

    public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.getSet().equals(node2.getSet())) {
            return null;
        } else {
            DisjointSet set1 = node1.getSet();
            DisjointSet set2 = node2.getSet();

            if (set1.nodeList.size() > set2.nodeList.size()) {
                List<WeightedNode> nodeSet2 = set2.nodeList;
                for (WeightedNode node : nodeSet2) {
                    node.setSet(set1);
                    set1.nodeList.add(node);
                }
                return set1;
            } else {
                List<WeightedNode> nodeSet1 = set1.nodeList;
                for (WeightedNode node : nodeSet1) {
                    node.setSet(set2);
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }

    public void printAllNodesofThisSet() {
        System.out.println("Printing all nodes of the set: ");
        for (WeightedNode node : nodeList) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    public List<WeightedNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }
}
