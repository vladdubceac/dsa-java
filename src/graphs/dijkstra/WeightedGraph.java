package graphs.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {
    private List<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public static void pathPrint(WeightedNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
        }
        System.out.print(node.getName() + " ");
    }

    void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.setDistance(0);
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.getNeighbors()) {
                if (queue.contains(neighbor)) {
                    if (neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
                        neighbor.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbor));
                        neighbor.setParent(currentNode);
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void addWeightedEdge(int i, int j, int weight) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.getNeighbors().add(second);
        first.getWeightMap().put(second, weight);
    }

    public List<WeightedNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }
}
