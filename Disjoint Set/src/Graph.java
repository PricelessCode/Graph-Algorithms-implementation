public class Graph {
    int numV, numE; // num of V and E
    Edge edges[]; // collection of edges

    // Edge inner class
    private class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    Graph(Edge[] edges) {
        this.numE = edges.length;
        this.numV = numE - 1;
        this.edges = edges;
    }
}
