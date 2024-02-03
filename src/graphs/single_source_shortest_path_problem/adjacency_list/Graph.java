package graphs.single_source_shortest_path_problem.adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Graph {
    List<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(List<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).getName() + ": ");
            for (int j =0; j < nodeList.get(i).getNeighbors().size(); j++) {
                if (j == nodeList.get(i).getNeighbors().size()-1 ) {
                    s.append((nodeList.get(i).getNeighbors().get(j).getName()) );
                } else {
                    s.append((nodeList.get(i).getNeighbors().get(j).getName()) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    // BFS internal
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            for(GraphNode neighbor : currentNode.getNeighbors()){
                if(!neighbor.isVisited()){
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    void bfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited()){
                bfsVisit(node);
            }
        }
    }
    public static void pathPrint(GraphNode node) {
        if (node.getParent()  != null) {
            pathPrint(node.getParent());
        }
        System.out.print(node.getName() + " ");
    }

    public void BFSForSSSPP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.print("Printing path for node " + currentNode.getName() + ": ");
            pathPrint(currentNode);
            System.out.println();
            for (GraphNode neighbor : currentNode.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                    neighbor.setParent(currentNode);
                }
            }
        }
    }
}
