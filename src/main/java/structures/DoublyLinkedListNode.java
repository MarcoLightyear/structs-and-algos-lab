package structures;

public class DoublyLinkedListNode {
    private DoublyLinkedListNode previousNode;
    private DoublyLinkedListNode nextNode;
    private String value;

    DoublyLinkedListNode(DoublyLinkedListNode previousNode, DoublyLinkedListNode nextNode, String value) {
        this.previousNode = previousNode;
        this.nextNode = nextNode;
        this.value = value;
    }

    public void setPreviousNode(DoublyLinkedListNode previousNode) {
        this.previousNode = previousNode;
    }

    public void setNextNode(DoublyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
