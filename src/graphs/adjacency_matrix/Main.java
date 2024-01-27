package graphs.adjacency_matrix;

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

        Graph g = new Graph(nodeList);
        g.addUnidirectedEdge(0,1);
        g.addUnidirectedEdge(0,2);
        g.addUnidirectedEdge(0,3);
        g.addUnidirectedEdge(1,4);
        g.addUnidirectedEdge(2,3);
        g.addUnidirectedEdge(3,4);
        System.out.println(g);

        g.bfs();
        System.out.println("\n----------");
        nodeList.forEach(node -> node.setVisited(false));
        g.dfs();
    }
}
