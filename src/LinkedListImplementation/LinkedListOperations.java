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

    public void deleteBeginningNode() {
      if (head == null) {
        System.out.println("Linked List is Empty");
      } else {
        head = head.getNextRef();
      }
    }

  public void deleteLinkedList() {
    head = null;
  }

  public boolean SearchNode(int element) {
    Node temp = head;
    while (temp != null) {
      if (temp.getData() == element)
        return true;
      temp = temp.getNextRef();
    }
    return false;
  }

public void displayLinkedList(){
Node temp=head;
if(temp==null){
    System.out.println("Linked list is Empty");
}
while(temp!=null){
  System.out.println(temp.getData()+" ");
  temp=temp.getNextRef();
}

}

}