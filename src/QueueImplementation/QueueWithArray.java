package QueueImplementation;

public class QueueWithArray {
    int top;
    int beginning;
    int arr[];

    public QueueWithArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        this.top = -1;
        this.beginning = -1;
    }

    public boolean isQueueFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isQueueEmpty() {
        if (beginning == -1 || top == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {           //from Rear End of Queue
        if (isQueueFull()) {
            System.out.println("Overflow occurred As Queue is Full..!");
        } else if (isQueueEmpty()) {
            beginning++;
            top++;
            arr[top] = data;
        } else {
            top++;
            arr[top] = data;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("UnderFlow occurred As Queue is Empty..!");
        } else {
            System.out.println("The element Deleted is : " + arr[beginning]);
            beginning++;
            if (beginning > top) {
                top = beginning = -1;
            }
        }
    }

    public void peekInQueue() {
        System.out.println(arr[beginning]);
    }

    public void deleteQueue(){
        top=-1;
        beginning=-1;
        System.out.println("Queue is Deleted Now..!");
    }

}