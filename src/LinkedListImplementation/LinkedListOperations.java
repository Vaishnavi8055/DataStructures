package LinkedListImplementation;

public class LinkedListOperations {
  Node head;


  public void insertAtBeginning(int new_data) {
    Node new_node = new Node(new_data);
    if (head == null) {
      head = new_node;
    } else {
      new_node.setNextRef(head);
      head = new_node;
    }

  }

}
