package QueueImplementation1;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLinkedList(Node front, Node rear, int size) {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isQueueEmpty(){
        if(size==0){
            return true;
        }
        else
            return false;
    }

}
