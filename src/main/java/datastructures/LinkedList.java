package datastructures;

public class LinkedList {

    Node head;

    public Node search(int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node insert(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
        return head;
    }

    public void delete(int i) {
        if (head.data == i) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = current;
        while (current != null) {
            if (current.data == i) {
                prev.next = current.next;
                return;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public class Node {
        int data;
        Node next;

        Node(int i) {
            this.data = i;
        }
    }
}
