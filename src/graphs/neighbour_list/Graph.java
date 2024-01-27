package graphs.neighbour_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Graph {
    List<GraphNode> nodeList = new ArrayList<>();

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.getNeighbours().add(second);
        second.getNeighbours().add(first);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).getName() + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).getName() + ": ");
            for (int j = 0; j < nodeList.get(i).getNeighbours().size(); j++) {
                if (j == nodeList.get(i).getNeighbours().size() - 1) {
                    s.append(nodeList.get(i).getNeighbours().get(j).getName());
                } else {
                    s.append(nodeList.get(i).getNeighbours().get(j).getName() + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    // BFS internal
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.print(currentNode.getName() + " ");
            for (GraphNode neighbor : currentNode.getNeighbours()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            for(GraphNode neighbor : currentNode.getNeighbours()){
                if(!neighbor.isVisited()){
                    stack.push(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    void dfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited()){
                dfsVisit(node);
            }
        }
    }
}
