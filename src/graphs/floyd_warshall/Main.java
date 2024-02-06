package graphs.floyd_warshall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A",0));
        nodeList.add(new WeightedNode("B",1));
        nodeList.add(new WeightedNode("C",2));
        nodeList.add(new WeightedNode("D",3));
        FloydWarshall floydWarshallGraph = new FloydWarshall(nodeList);
        floydWarshallGraph.addWeightedEdge(0,3,1);
        floydWarshallGraph.addWeightedEdge(0,1,8);
        floydWarshallGraph.addWeightedEdge(1,2,1);
        floydWarshallGraph.addWeightedEdge(2,0,4);
        floydWarshallGraph.addWeightedEdge(3,1,2);
        floydWarshallGraph.addWeightedEdge(3,2,9);
        System.out.println("Printing Floyd-Warshall algorithm from source A : ");
        floydWarshallGraph.floydWarshall();
    }
}
