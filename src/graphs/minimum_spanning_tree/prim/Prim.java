package graphs.minimum_spanning_tree.prim;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {
    private List<WeightedNode> nodeList = new ArrayList<>();

    public Prim(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // add a weighted undirected edge between 2 nodes
    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        WeightedNode first = nodeList.get(firstIndex);
        WeightedNode second = nodeList.get(secondIndex);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
        first.getWeightMap().put(second, weight);
        second.getWeightMap().put(first, weight);
    }

    // Prim's algorithm from source node
    void prims(WeightedNode node) {
        for (int counter = 0; counter < nodeList.size(); counter++) {
            nodeList.get(counter).setDistance(Integer.MAX_VALUE);
        }
        node.setDistance(0); // Setting '0' distance for Source vertex

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();

        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode presentNode = queue.remove(); // Remove vertex which has min distance
            for (WeightedNode neighbor : presentNode.getNeighbors()) {
                if (queue.contains(neighbor)) {
                    // If vertex is not processed, only then enter in if-else
                    // If known weight of this �adjacent vertex� is more than current edge,
                    // then update �adjacent vertex�s� distance and parent
                    if (neighbor.getDistance() > presentNode.getWeightMap().get(neighbor)) {
                        neighbor.setDistance(presentNode.getWeightMap().get(neighbor));
                        neighbor.setParent(presentNode);

                        queue.remove(neighbor); // Refresh the priority queue
                        queue.add(neighbor);
                    }
                }
            }
        }

        int cost = 0;
        // print table of node with minimum distance and shortest path from source
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key: " + nodeToCheck.getDistance() + ", Parent: " + nodeToCheck.getParent());
            cost = cost + nodeToCheck.getDistance();
        }

        System.out.println("\nTotal cost of minimum spanning tree: " + cost);
    }

    public List<WeightedNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }
}
