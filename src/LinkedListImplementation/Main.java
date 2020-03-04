package LinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        LinkedListOperations linkedListOperations = new LinkedListOperations();
        linkedListOperations.head = new Node(19);
        Node node1 = new Node(45);
        Node node2 = new Node(75);
        Node node3 = new Node(12);

        linkedListOperations.head.setNextRef(node1);
        node1.setNextRef(node2);
        node2.setNextRef(node3);

        System.out.println("My Linked list is :");
        linkedListOperations.displayLinkedList();


        System.out.println("Insertion at Beginning, Now My Linked List is: ");
        linkedListOperations.insertAtBeginning(56);
        linkedListOperations.displayLinkedList();

        System.out.println("Deletion of Beginning Node :");
        linkedListOperations.deleteBeginningNode();
        linkedListOperations.displayLinkedList();


        System.out.println("Deletion Of Linked List");
        linkedListOperations.deleteLinkedList();

        System.out.println("Now the Linked list is Deleted :");
        System.out.println();
        linkedListOperations.displayLinkedList();

    }
}