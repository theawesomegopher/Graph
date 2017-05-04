package ekordik.cuw.edu.graph;

/**
 * Created by emmakordik on 5/3/17.
 */

public class Edge {
    private int weight;
    private Vertex destination;

    public Edge(int weight) {
        this.weight = weight;
    }

    public Edge(int payload, Vertex destination){
        this.weight = weight;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", destination=" + destination +
                '}';
    }
}
