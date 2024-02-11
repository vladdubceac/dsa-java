package graphs.exercices.routes_between_nodes;

import java.util.*;

public  class GraphNode {
  public String name;
  public int index;
  public boolean isVisited = false;
  public GraphNode parent;
  public Graph.State state;

  public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

  public GraphNode(String name, int index) {
    this.name = name;
    this.index = index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GraphNode graphNode = (GraphNode) o;

    if (index != graphNode.index) return false;
    return name != null ? name.equals(graphNode.name) : graphNode.name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + index;
    return result;
  }
}