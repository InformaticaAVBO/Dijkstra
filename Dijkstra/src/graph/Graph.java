
package graph;

import java.util.HashSet;

/*
* Un grafo generico è un insieme di nodi generici
*/

public class Graph<T extends Comparable<T>> {
	
	private HashSet<Node<T>> nodes;

	public Graph() {
		this.nodes = new HashSet<>();
	}

	@Override
	public String toString() {
		String s = "";
		for (Node<T> node : nodes) {
			s += node.toString() + "\n";
		}
		return "Graph:\n" + s;
	}

}
