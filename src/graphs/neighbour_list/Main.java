package graphs.neighbour_list;

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
        nodeList.add(new GraphNode("H",7));

        Graph newGraph = new Graph(nodeList);
//        g.addUndirectedEdge(0,1);
//        g.addUndirectedEdge(0,2);
//        g.addUndirectedEdge(0,3);
//        g.addUndirectedEdge(1,4);
//        g.addUndirectedEdge(2,3);
//        g.addUndirectedEdge(3,4);

//        g.bfs();
//        System.out.println("\n---------");
//        g.nodeList.forEach(n->n.setVisited(false));
//        g.dfs();

        newGraph.addDirectedEdge(0,2);
        newGraph.addDirectedEdge(2,4);
        newGraph.addDirectedEdge(4,7);
        newGraph.addDirectedEdge(4,5);
        newGraph.addDirectedEdge(5,6);
        newGraph.addDirectedEdge(1,2);
        newGraph.addDirectedEdge(1,3);
        newGraph.addDirectedEdge(3,5);
        System.out.println(newGraph);

        newGraph.topologicalSort();

    }
}
