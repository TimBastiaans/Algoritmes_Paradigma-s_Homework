package Graph;

import java.util.LinkedList;
import java.util.List;

// Represents a vertex in the graph.
class Vertex {
    public String name; // Vertex name
    public List<Edge> adj; // Adjacent vertices
    public double dist; // Cost
    public Vertex prev; // Previous vertex on shortest path
    public int scratch;// Extra variable used in algorithm

    public Vertex(String nm) {
        name = nm;
        adj = new LinkedList<Edge>();
        reset();
    }

    public void reset() {
        dist = Graph.INFINITY;
        prev = null;
        //pos = null;
        scratch = 0;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
//        Vertex henk = new Vertex("Henk");
//        Vertex nils = new Vertex("Nils");
//        Vertex jan = new Vertex("Nils");

//        Edge henktojan = new Edge(jan, 1);
//        Edge henktonils = new Edge(nils, 5);
//        Edge jantonils = new Edge(nils, 2);

        graph.addEdge("Henk", "Jan", 1);
        graph.addEdge("Henk", "Nils", 5);
        graph.addEdge("Jan", "Nils", 2);

        graph.addEdge("Piet", "Jan", 3);
        graph.addEdge("Lima", "Jan", 4);
        graph.addEdge("pemmel", "Henk", 1);

        System.out.print(graph.toString());

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        for(Edge edge:adj) {
            stringBuilder.append(name);
           // stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}