package LinkedListImplementation;

public class Node {
    private int data;
    private Node nextRef;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node nextRef) {
        this.nextRef = nextRef;
    }

}
