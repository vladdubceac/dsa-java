package graphs.exercices.routes_between_nodes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));
        nodeList.add(new GraphNode("H",7));
        nodeList.add(new GraphNode("I",8));
        nodeList.add(new GraphNode("J",9));
        Graph graph = new Graph(nodeList);
        graph.addDirectedEdge(0,1); // A->B
        graph.addDirectedEdge(0,2); // A->C
        graph.addDirectedEdge(0,3); // A->D
        graph.addDirectedEdge(1,9); // B->J
        graph.addDirectedEdge(2,6); // C->G

        graph.addDirectedEdge(6,3); // G->D
        graph.addDirectedEdge(6,7); // G->H

        graph.addDirectedEdge(4,0); // E->A
        graph.addDirectedEdge(4,5); // E->F
        graph.addDirectedEdge(5,8); // F->I

        graph.checkRoute(0,4);
        graph.checkRoute(4,0);
    }
}
