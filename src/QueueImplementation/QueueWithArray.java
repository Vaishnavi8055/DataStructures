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
}