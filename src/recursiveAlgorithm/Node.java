package recursiveAlgorithm;

public class Node {
    //field
    int data;
    Node lt;
    Node rt;

    //cons
    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}
