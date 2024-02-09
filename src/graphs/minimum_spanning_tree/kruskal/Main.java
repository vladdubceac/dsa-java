package graphs.minimum_spanning_tree.kruskal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));

        Kruskal graph = new Kruskal(nodeList);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,13);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);

        System.out.println("Running Kruskal Algorithm on the graph : ");
        graph.kruskal();
    }
}
