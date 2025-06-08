package dijkstra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dijkstra {
    
    Graph g = new Graph();

    public Dijkstra( String csvfilename ) {
        loadFromCsv(csvfilename);
    }

    public Graph getGraph() {
        return g;
    }

    private void loadFromCsv( String csvfilename ) {
        int rows = 0;
        File f = new File(csvfilename);
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                rows++;
                String s = scan.nextLine();
                String[] ss = s.split(";");
                Node from = g.addNode(ss[0]);
                Node to = g.addNode(ss[1]);
                from.addAdjacent(to, Float.parseFloat(ss[2]));
                to.addAdjacent(from, Float.parseFloat(ss[2]));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
   		System.out.println(g.getNames());
        System.out.println("Loaded " + rows + " rows from " + csvfilename);
    }

    public void calculateShortestPathFromSource( Node source ) {
	    source.setDistance((float)0);
	    HashSet<Node> settledNodes = new HashSet<>();
	    HashSet<Node> unsettledNodes = new HashSet<>();
	    unsettledNodes.add(source);
	    while (unsettledNodes.size() != 0) {
	        Node currentNode = getLowestDistanceNode(unsettledNodes);
	        unsettledNodes.remove(currentNode);
	        for ( Entry <Node, Float> adjacencyPair: currentNode.getAdjacentNodes().entrySet() ) {
	            Node adjacentNode = adjacencyPair.getKey();
	            Float edgeWeight = adjacencyPair.getValue();
	            if (!settledNodes.contains(adjacentNode)) {
	                calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
	                unsettledNodes.add(adjacentNode);
	            }
	        }
	        settledNodes.add(currentNode);
	    }
	}	
	
	private Node getLowestDistanceNode(HashSet<Node> unsettledNodes) {
		/*
		 * restituisce il nodo con la minima distanza fra quelli non sistemati
		 */
	    Node lowestDistanceNode = null;
	    float lowestDistance = Integer.MAX_VALUE;
	    for (Node node: unsettledNodes) {
	        float nodeDistance = node.getDistance();
	        if (nodeDistance < lowestDistance) {
	            lowestDistance = nodeDistance;
	            lowestDistanceNode = node;
	        }
	    }
	    return lowestDistanceNode;
	}

    private void calculateMinimumDistance(Node evaluationNode, Float edgeWeigh, Node sourceNode) {
	    Float sourceDistance = sourceNode.getDistance();
	    if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
	        evaluationNode.setDistance(sourceDistance + edgeWeigh);
	        LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
	        shortestPath.add(sourceNode);
	        evaluationNode.setShortestPath(shortestPath);
	    }
	}    
}
