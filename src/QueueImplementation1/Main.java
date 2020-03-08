package QueueImplementation1;

public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList=new QueueUsingLinkedList();
        System.out.println("Queue is :");
        queueUsingLinkedList.Enqueue(98);
        queueUsingLinkedList.Enqueue(45);
        queueUsingLinkedList.Enqueue(65);
        queueUsingLinkedList.Enqueue(67);
        queueUsingLinkedList.display();

        System.out.println("Dequeue Operation,Now queue is ..");
         queueUsingLinkedList.dequeue();
         queueUsingLinkedList.display();

        System.out.println("peak Operation :");
        queueUsingLinkedList.peek();

        System.out.println("size of Queue :");
        queueUsingLinkedList.getSize();
        System.out.println(queueUsingLinkedList.getSize());

    }
}
