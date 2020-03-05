package QueueImplementation;

public class Main {
    public static void main(String[] args) {
        QueueWithArray queueWithArray = new QueueWithArray(4);

        queueWithArray.enqueue(18);
        queueWithArray.enqueue(22);
        queueWithArray.enqueue(25);
        queueWithArray.enqueue(45);
        queueWithArray.enqueue(65);

        System.out.println("Queue is: ");
        queueWithArray.displayQueue();

        queueWithArray.dequeue();
        System.out.println("Now after dequeue Queue is :");
        queueWithArray.displayQueue();

        System.out.println("peekInQueue operation : Check whether an element is at top or not");
        queueWithArray.peekInQueue();

        System.out.println("Delete Operation is :");
        queueWithArray.deleteQueue();
        queueWithArray.displayQueue();

    }
}
