package datastructureandalgo.linkedlist.siglylinkedlist;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    //1) traverse through node

    public void displayNode() {
        Node p;              // just creating a Node type reference variable
        if (head == null) {
            System.out.println("SLL is empty");
            return;
        }
        p = head;

        while (p.link != null) {
            System.out.println(p.data);
            p = p.link;
        }
        System.out.println(p.data);
    }


    //2) count no of node
    public int countNodes() {
        int count = 0;
        Node p = head;

        while (p.link != null) {
            count++;
            p = p.link;
        }
        return count;
    }

    //3) search node with given position number given

    public boolean searchNode(int x) {
        int pos = 1;
        Node p = head;

        while (p.link != null) {
            if (p.data == x)
                break;
            p = p.link;

        }
        if (p == null) {
            System.out.println(x + " " + "not found in SLL");
            return false;
        } else {
            System.out.println(x + "" + "found at position " + pos);
            return true;
        }
    }

    //4) insert at beginning if there is no node else it will add at end
    public void insertAtBinning(int x) {
        Node temp = new Node(x);
        head = temp;
     }

    //5) insert at end
    public void insertAtEnd(int x) {
        Node temp = new Node(x);
        if (head == null) head = temp;
        Node p = head;

        while (p.link != null) {
            p = p.link;
        }
        p.link = temp;
        temp.link = null;    //not needed
    }

    //6) insert data after node which value = k
    public void insertAfter(int data, int k) {
        Node p = head;
        while (p != null) {
            if (p.data == k ) break;
            p = p.link;
        }
        if (p.link == null) {
            System.out.println(k + " " + "is not found in sLL to insert after ");
        } else {
            Node temp = new Node(data);
            temp.link = p.link;
            p.link = temp;
        }
    }

    //7) insert data before k node ( node.data=k)
    public void insertBefore(int data, int k) {
        Node temp = new Node(data);
        if (head == null) head = temp;
        Node p = head;
        while (p.link != null) {
            if (p.link.data == k) break;
            p = p.link;
        }
        if (p.link == null) {
            System.out.println(k + " " + "is not found in SLL to insert before");
        } else {
            temp.link = p.link;
            p.link = temp;
        }
    }

    //8) insert at position k
    public void insertAtPosition(int data, int k) {
        Node temp;

        if(k==1) {
            temp = new Node(data);
            temp.link= head;
            head = temp;
        }
        Node p=head;
        for(int i=0; i<k-1 && p.link!= null;i++) {
            p= p.link;
        }
        if(p== null) {
//            System.out.println("We can insert only upto "+i+ "th psotion");
        } else {

        }
    }




}
