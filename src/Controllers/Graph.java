package Controllers;

import Models.Node;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;
    
    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node addNode(int value){
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node dest){
        src.addNeighbor(dest);
    }

    public void printlGraph(){
        for (Node node : nodes) {
            System.out.print("Vertex " + node.getValue() + ":");
            for (Node neighbor : node.getNeighbors()) {
            System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDFS(Node startNode){

    }

    private void getDFS(Node node, boolean[] visited){

    }

    public void getBFS(Node startNode){

    }

    public int[][] getAdjacencyMatrix(){
        return null;
    }

    public void printlAdjacencyMatrix(){

    }
}
