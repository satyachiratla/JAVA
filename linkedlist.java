public class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (node == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data)
    }
}

class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.show();
    }
}