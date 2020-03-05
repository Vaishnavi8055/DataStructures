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
}

