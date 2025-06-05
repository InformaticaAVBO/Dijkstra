public class Arc {
    
    Node destination;
    int distance;

    public Arc(Node destination, int distance) {
        this.destination = destination;
        this.distance = distance;
    }

    public Node getDestination() {
        return destination;
    }
    public void setDestination(Node destination) {
        this.destination = destination;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    @Override
    public String toString() {
        return "Arc [destination=" + destination + ", distance=" + distance + "]";
    }

    
}
