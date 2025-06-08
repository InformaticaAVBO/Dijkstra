package graph;

import java.util.PriorityQueue;

/*
 * Un nodo di un grafo generico è descritto da un valore T contenuto e dalla lista ordinata per T dei nodi adiacenti
*/

public class Node<T extends Comparable<T>> {

    protected T value;
    protected PriorityQueue<Node<T>> adjacentNodes;
    
    public Node( T value ) {
        this.value = value;
        this.adjacentNodes = new PriorityQueue<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public PriorityQueue<Node<T>> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(PriorityQueue<Node<T>> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

}
