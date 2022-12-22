public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }
        end.next = new_node;
    }

    public void print() {
        Node node = head;

    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);
        llist.append(5);

    }
}
