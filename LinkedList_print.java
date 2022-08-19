// A simple Java program for traversal of a linked list
public class LinkedList_print {
    Node head; // head of list
    // ! Node tail; // tail of list
    // tail maine banayi hai
    /*
     * Linked list Node. This inner class is made static so that
     * main() can access it
     */

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        // ! System.out.println(tail.next);
    }

    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList_print llist = new LinkedList_print();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node
        // ! llist.tail = third;
        llist.printList();
    }
}
