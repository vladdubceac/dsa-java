package graphs.floyd_warshall;

import java.util.ArrayList;
import java.util.List;

public class FloydWarshall {

    private List<WeightedNode> nodeList = new ArrayList<>();


    //Constructor
    public FloydWarshall(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }


    void floydWarshall() {
        int size = nodeList.size();
        int[][] V = new int[size][size];

        // Initializing Distance table from adjacency list
        for (int source = 0; source < size; source++) {
            WeightedNode first = nodeList.get(source);
            for (int destination = 0; destination < size; destination++) {
                WeightedNode second = nodeList.get(destination);
                if (source == destination)
                    V[source][destination] = 0;
                else if (first.getWeightMap().containsKey(second)) { //we have direct edge between i & j
                    V[source][destination] = first.getWeightMap().get(second);
                } else { //no direct edge between i & j, so mark it as infinity [divided by 10 to avoid arithmetic overflow]
                    V[source][destination] = Integer.MAX_VALUE / 10;
                }
            }
        }//end of loop


        // Floyd Warshall's Algorithm
        for (int intermediate = 0; intermediate < nodeList.size(); intermediate++) {
            for (int source = 0; source < nodeList.size(); source++) {
                for (int destination = 0; destination < nodeList.size(); destination++) {
                    if (V[source][destination] > V[source][intermediate] + V[intermediate][destination]) {  // if update possible, then update path
                        V[source][destination] = V[source][intermediate] + V[intermediate][destination];    // this will keep a track on path
                    }
                }
            }
        }//end of loop


        // Print table of node with minimum distance and shortest path from each source
        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list for node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }

    }// end of method


    // add a weighted edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.getNeighbors().add(second);
        first.getWeightMap().put(second, d);
    }// end of method

    public List<WeightedNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }
}// end of class
