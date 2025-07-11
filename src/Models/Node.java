package Models;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private int value;
    private Set<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node neighbor) {
        if (neighbor != this) {  
            neighbors.add(neighbor);
        }
    }
}
