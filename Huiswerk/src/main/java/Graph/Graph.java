package Graph;// Graph class: evaluate shortest paths.
//
// CONSTRUCTION: with no parameters.
//
// *******PUBLIC OPERATIONS*******
// void addEdge( String v, String w, double cvw )
// --> Add additional edge
// void printPath( String w ) --> Print path after alg is run
// void unweighted( String s ) --> Single-source unweighted
// void dijkstra( String s ) --> Single-source weighted
// void negative( String s ) --> Single-source negative weighted
// void acyclic( String s ) --> Single-source acyclic
// *******ERRORS************
// Some error checking is performed to make sure that graph is ok
// and that graph satisfies properties needed by each
// algorithm. Exceptions are thrown if errors are detected.

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;

    public void addEdge(String sourceName, String destName, double cost) {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }

    public void printPath(String destName) {
        Vertex w = vertexMap.get(destName);
        if (w == null)
            throw new NoSuchElementException();
        else if (w.dist == INFINITY)
            System.out.println(destName + " is unreachable");
        else {
            System.out.print("(Cost is: " + w.dist + ") ");
            printPath(w);
            System.out.println();
        }
    }

    public void unweighted(String startName) { /* Figure 22 */ }

    public void dijkstra(String startName) { /* Figure 27 */ }

    public void negative(String startName) { /* Figure 29 */ }

    public void acyclic(String startName) { /* Figure 32 */ }

    private Vertex getVertex(String vertexName) {
        Vertex v = vertexMap.get(vertexName);
        if (v == null) {
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }

    private void printPath(Vertex dest) {
        if (dest.prev != null) {
            printPath(dest.prev);
            System.out.print(" to ");
        }
        System.out.print(dest.name);
    }

    private void clearAll() {
        for (Vertex v : vertexMap.values())
            v.reset();
    }

    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();

    @Override
    public String toString() {
        StringBuilder returnableString = new StringBuilder();
        for (Vertex v : vertexMap.values()) {
            returnableString.append(v.toString());
            returnableString.append("\n");
        }
        return returnableString.toString();
    }
}