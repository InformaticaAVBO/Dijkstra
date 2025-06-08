package dijkstra;

import java.util.HashSet;

public class Graph {
	
	private HashSet<Node> nodes;

	public Graph() {
		this.nodes = new HashSet<>();
	}

	// public boolean addNode( Node node ) { return nodes.add(node); }
	
	public Node getNode( String name ) {
		for (Node i : nodes) {
			if ( i.getName().equalsIgnoreCase(name) ) return i;
		}
		return null;
	}
	
	public Node addNode( String name ) {
		Node n = getNode( name );
		if (n==null) {
			n = new Node(name);
			nodes.add( n );
		}
		return n;
	}

    public HashSet<Node> getNodes() { return nodes; }
    
    public String getNames() {
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for (Node node : nodes) {
            sb.append(node.getName()).append( n%5==0 ? "\n" : "\t" );
            n++;
        }
        return sb.toString().trim();
    }

	@Override
	public String toString() {
		String s = "";
		for (Node node : nodes) {
			s += node.toString() + "\n";
		}
		return "Graph:\n" + s;
	}

}
