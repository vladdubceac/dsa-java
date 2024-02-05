package graphs.bellman_ford;

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

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.getNeighbors().add(second);
        first.getWeightMap().put(second, d);
    }

    // Bellman Ford algorithm
    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.setDistance(0);
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.getNeighbors()) {
                    if (neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
                        neighbor.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbor));
                        neighbor.setParent(currentNode);
                    }
                }
            }
        }
        System.out.println("Checking for Negative Cycle ... ");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbor : currentNode.getNeighbors()) {
                if (neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
                    System.out.println("Negative cycle found : ");
                    System.out.println("Vertex name : " + neighbor.getName());
                    System.out.println("Old cost : " + neighbor.getDistance());
                    int newDistance = currentNode.getDistance() + currentNode.getWeightMap().get(neighbor);
                    System.out.println("new cost: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative Cycle not found");

        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }
}
