package graphs.exercices.routes_between_nodes;

import java.util.*;


public class Graph {


    static ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void checkRoute(int first, int second) {
        GraphNode node1 = nodeList.get(first);
        GraphNode node2 = nodeList.get(second);

        boolean hasRoute = search(node1, node2);

        System.out.println(node1.name + " -> " + node2.name + " => " + hasRoute);
    }

    private boolean search(GraphNode start, GraphNode end) {
        LinkedList<GraphNode> q = new LinkedList<>();
        for(GraphNode node : nodeList){
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        GraphNode currentNode;
        while (!q.isEmpty()){
            currentNode = q.removeFirst();
            if(currentNode!=null){
                for(GraphNode v : currentNode.neighbors){
                    if(v.state==State.Unvisited){
                        if(v==end){
                            return true;
                        }else{
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
            currentNode.state=State.Visited;
            }
        }
        return false;
    }

    private Map<GraphNode, List<GraphNode>> populateNeighborsMap(ArrayList<GraphNode> nodes) {
        Map<GraphNode, List<GraphNode>> nodeNeighborsMap = new HashMap<>();

        for (GraphNode node : nodes) {
            nodeNeighborsMap.put(node, node.neighbors);
            if (!node.neighbors.isEmpty()) {
                nodeNeighborsMap.putAll(populateNeighborsMap(node.neighbors));
            }
        }
        return nodeNeighborsMap;
    }

    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }


    public enum State {
        Unvisited, Visited, Visiting;
    }
}
