import java.util.ArrayList;

public class Node {
    
    String name;
    int distance;
    Node previous;
    ArrayList<Arc> neighbours;
    
    public Node( String name ) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        previous = null;
        neighbours = new ArrayList<>();
    }
    
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public Node getPrevious() {
        return previous;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Node [name=" + name + ", distance=" + distance + "]";
    }

    

}
