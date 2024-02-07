package graphs.minimum_spanning_tree.disjoint_set;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode> {
    private String name;
    private List<WeightedNode> neighbors = new ArrayList<WeightedNode>();
    private Map<WeightedNode, Integer> weightMap = new HashMap<>();
    private boolean isVisited = false;
    private WeightedNode parent;
    private int distance;
    private int index;
    private DisjointSet set;

    public WeightedNode(String name) {
        this.name = name;
    }

    public WeightedNode(String name, int index) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeightedNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<WeightedNode> neighbors) {
        this.neighbors = neighbors;
    }

    public Map<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(Map<WeightedNode, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public DisjointSet getSet() {
        return set;
    }

    public void setSet(DisjointSet set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }


}
