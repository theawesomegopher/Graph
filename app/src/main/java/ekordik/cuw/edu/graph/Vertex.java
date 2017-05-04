package ekordik.cuw.edu.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by emmakordik on 5/3/17.
 */

public class Vertex {
    private int id;
    private String name;
    private List<Edge> edges = new LinkedList<>();

    public Vertex(int id, String name){
        this.name = name;
        this.id = id;
    }

    public Edge addEdge(int weight, Vertex destination) {
        Edge e = new Edge(weight, destination);
        edges.add(e);
        return e;
    }

    public void addEdge(Edge edge){
        this.edges.add(edge);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        if (id != vertex.id) return false;
        return name != null ? name.equals(vertex.name) : vertex.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edges count=" + edges.size() +
                '}';
    }
}
