package ekordik.cuw.edu.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by emmakordik on 5/3/17.
 */

public class Graph {
    private Vertex startingPoint;
    private List<Vertex> vertics = new LinkedList<>();

    public Graph(String name){
        startingPoint = new Vertex(0, name);
        vertics.add(startingPoint);
    }

    public String addVertex(String name){
        Vertex v = new Vertex(vertics.size(), name);
        vertics.add(v);
        return v.toString();
    }

    public String addEdge(int beginningId, int endingId, int weight){
        Vertex start;
        for(Vertex v : vertics){
            if(v.getId() == beginningId){
                for(Vertex ev : vertics){
                    if(ev.getId() == endingId){
                        return v.addEdge(weight, ev).toString();
                    }
                }
            }
        }
        return "";
    }

    public Vertex getStartingPoint(){
        return this.startingPoint;
    }

    public List<Vertex> getVertics(){
        return this.vertics;
    }
}
