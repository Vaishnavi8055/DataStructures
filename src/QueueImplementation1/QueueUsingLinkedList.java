package QueueImplementation1;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isQueueEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int element){
        Node new_node=new Node(element);
       if(front==null){
           rear=new_node;
           front=new_node;
           size++;
        }
       else{
           rear.setNext(new_node);
           rear=new_node;
           size++;
       }
    }

    public void dequeue(){
        if(front!=null){
            if(front.getNext()!=null){
                front=front.getNext();
                size--;
            }
            else{
                front=null;
                rear=null;
                size--;
            }
        }
    }
}

