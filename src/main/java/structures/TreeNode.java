package structures;

public class TreeNode {
    private String value;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode(String value, TreeNode leftChild, TreeNode rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
