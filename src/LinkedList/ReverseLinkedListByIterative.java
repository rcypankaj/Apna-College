package LinkedList;
// Reverse LinkedList by Interave method
// Start
public class ReverseLinkedListByIterative {
    Node head;
    private int size;
    class Node{
        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
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

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if (head == null || head.next == null)
            return;

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        ReverseLinkedListByIterative list = new ReverseLinkedListByIterative();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.reverseIterate();
        list.printList();

    }
}

// End
