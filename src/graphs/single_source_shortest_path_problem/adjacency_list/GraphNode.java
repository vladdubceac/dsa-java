package graphs.single_source_shortest_path_problem.adjacency_list;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private String name;
    private int index;
    private boolean isVisited = false;
    private GraphNode parent;

    private List<GraphNode> neighbors = new ArrayList<GraphNode>();

    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<GraphNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<GraphNode> neighbors) {
        this.neighbors = neighbors;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }
}
