package graphs.single_source_shortest_path_problem.adjacency_matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Graph {
    private List<GraphNode> nodeList = new ArrayList<GraphNode>();
    private int[][] adjacencyMatrix;

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUnidirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).getName() + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).getName() + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append(j + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get Neighbors
    public List<GraphNode> getNeighbors(GraphNode node) {
        List<GraphNode> neighbors = new ArrayList<GraphNode>();
        int nodeIndex = node.getIndex();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    // BSF internal
    void bfsVisit(GraphNode node) {
        List<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.print(currentNode.getName() + " ");
            List<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);
            System.out.println(currentNode.getName() + " ");
            List<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    stack.push(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                dfsVisit(node);
            }
        }
    }

    // Topological Sort
    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        List<GraphNode> neighbors = getNeighbors(node);
        for (GraphNode neighbor : neighbors) {
            if (!neighbor.isVisited()) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.setVisited(true);
        stack.push(node);
    }

    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getName() + " ");
        }
    }

    //Print path of each of the vertex from source
    public static void pathPrint(GraphNode node) {
        if(node.getParent()!=null) {
            pathPrint(node.getParent());
        }
        System.out.print(node.getName()+" ");
    }

    public void BFSForSSSPP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.print("Printing path for node "+currentNode.getName()+" : ");
            pathPrint(currentNode);
            System.out.println();
            List<GraphNode> neighbors = getNeighbors(currentNode);
            for(GraphNode neighbor : neighbors){
                if(!neighbor.isVisited()){
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                    neighbor.setParent(currentNode);
                }
            }
        }
    }


}
