
package dijkstra;

import java.util.HashMap;
import java.util.LinkedList;

/*
 * Il nodo che usiamo per il nosytro grafo di Dijkstra ha un nome,
 * la distanza dal nodo sorgente ed il cammino più breve per raggiungerlo,
 * e la lista dei nodi adiacenti con la relativa distanza da ciascuno di essi
 * */


public class Node {

    protected String name;
    protected float distance;
    protected LinkedList<Node> shortestPath;
    protected HashMap<Node, Float> adjacentNodes;

    public Node( String name ) {
        this.name = name;
        shortestPath = new LinkedList<>();
        distance = Float.POSITIVE_INFINITY;
        adjacentNodes = new HashMap<>();
    }

    public void addAdjacent(Node node, float weight) {
        adjacentNodes.put(node, weight);
    }

    public String getName() { return name; }
    public LinkedList<Node> getShortestPath() { return shortestPath; }
    public void setShortestPath(LinkedList<Node> shortestPath) { this.shortestPath = shortestPath;  }
    public float getDistance() { return distance; }
    public void setDistance(float distance) { this.distance = distance; }
    public HashMap<Node, Float> getAdjacentNodes() { return adjacentNodes; }
    
    @Override
    public String toString() {
        return name + " [" + distance + "]";
    }


}
