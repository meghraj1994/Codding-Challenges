package neetcode.linkedList;

public class MainClass {

    public static void main(String[] args) {
       SinglyLinkedList list = new SinglyLinkedList();
       list.insertAtBeg(1);
      list.insertAtBeg(2);
      list.insertAtEnd(20);
      list.insertAtSomePos(3,9);

       list.printList();
    }
}
