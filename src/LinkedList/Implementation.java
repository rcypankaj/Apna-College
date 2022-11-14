package LinkedList;
// Start
public class Implementation {
    Node head;
    private int size;
    Implementation() {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("This list is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;
        head = this.head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // get size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Implementation list = new Implementation();
        list.addFirst("My");
        list.addLast("Name");
        list.addLast("is");
        list.addLast("Pankaj Yadav");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
// End