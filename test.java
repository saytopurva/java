public class test {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node2.value = 2;
        node1.value = 1;
        node1.next = node2;
        node2.next = null;
        
        linkedlist.value = 1;
        linkedlist.next = null;
    }
}
class Node {
    public int value;
    public Node next;   
}