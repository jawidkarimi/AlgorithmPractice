package linkedList;

public class MyLinkList {

    Node head;
    Node tail;
    int size;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void linkDelete(Node head, int m, int n) {
        int count = 0;
        Node current = head;
        while (current != null && current.next != null) {
            count++;
            int x = n;
            if (count == m) {
                while (x > 0) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        return;
                    }
                    x--;
                }
                x = n;
                current = current.next;

            }
        }

    }

    public void printNode() {

        if (head == null) {
            System.out.println("empty");
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data+"->");
            current = current.next;
        }

    }
}
