package neetcode.linkedList;

public class SinglyLinkedList {
    Node head;

    public void insertAtBeg(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;

    }

    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //    1,2,3,<9>,4,5
    public void insertAtSomePos(int i, int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = head;
        int count = 0;
        while (temp.next != null && count < i - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
