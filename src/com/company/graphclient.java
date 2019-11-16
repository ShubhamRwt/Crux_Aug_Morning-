package com.company;

public class graphclient {
    public static void main(String[] args) {


        AdjacencyMapgraph graph = new AdjacencyMapgraph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);



        graph.addEdgeWeight(1, 2, 10);
        graph.addEdgeWeight(2, 3, 30);
        graph.addEdgeWeight(3, 1, 20);

       AdjacencyMapgraph gg =graph.kruskal();
    }
}