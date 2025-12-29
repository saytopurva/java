public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListBasic {

    Node head;

    // INSERT at end
    void insert(int data) {
        Node newNode = new Node(data);

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

    // DELETE by value
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // UPDATE value
    void update(int oldData, int newData) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldData) {
                temp.data = newData;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element not found");
    }

    // DISPLAY
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        LinkedListBasic list = new LinkedListBasic();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        list.delete(20);
        list.display();

        list.update(30, 40);
        list.display();
    }
}
