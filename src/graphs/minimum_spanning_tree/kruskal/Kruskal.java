package graphs.minimum_spanning_tree.kruskal;

import java.util.*;

public class Kruskal {
    private List<WeightedNode> nodeList = new ArrayList<>();
    private List<UndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = edge.getFirst();
        WeightedNode second = edge.getSecond();

        first.getNeighbors().add(second);
        second.getNeighbors().add(first);

        first.getWeightMap().put(second, weight);
        second.getWeightMap().put(first, weight);

        edgeList.add(edge);
    }

    void kruskal() {
        DisjointSet.makeSet(nodeList);
        edgeList.sort(Comparator.comparingInt(UndirectedEdge::getWeight));
        int cost = 0;
        for (UndirectedEdge edge : edgeList) {
            WeightedNode first = edge.getFirst();
            WeightedNode second = edge.getSecond();
            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.getWeight();
                System.out.println("Taken " + edge);
            }
        }

        System.out.println("Total cost of Minimum Spanning Tree = " + cost);
    }
}
