package structures;

public class Node {
    private String value;
    private Node nextNode;

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(String value) {
        this.value = value;
    }
}
