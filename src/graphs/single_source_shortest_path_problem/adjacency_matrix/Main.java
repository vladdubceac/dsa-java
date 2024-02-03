package graphs.single_source_shortest_path_problem.adjacency_matrix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));
        Graph newGraph = new Graph(nodeList);
        newGraph.addUnidirectedEdge(0,1); // A-B
        newGraph.addUnidirectedEdge(0,2); // A-C
        newGraph.addUnidirectedEdge(1,3); // B-D
        newGraph.addUnidirectedEdge(1,6); // B-G
        newGraph.addUnidirectedEdge(2,3); // C-D
        newGraph.addUnidirectedEdge(2,4); // C-E
        newGraph.addUnidirectedEdge(3,5); // D-F
        newGraph.addUnidirectedEdge(4,5); // E-F
        newGraph.addUnidirectedEdge(5,6); // F-G
        System.out.println(newGraph.toString());
        newGraph.BFSForSSSPP(nodeList.get(0));
    }
}
