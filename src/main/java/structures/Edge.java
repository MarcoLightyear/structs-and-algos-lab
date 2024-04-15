package structures;

public class Edge {
    private Vertex start;
    private Vertex end;
    private int weight;

    public Edge(Vertex startVertex, Vertex endVertex, int inputWeight) {
        this.start = startVertex;
        this.end = endVertex;
        this.weight = inputWeight;
    }


    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }
}
