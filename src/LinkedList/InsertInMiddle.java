package LinkedList;
// Start

public class InsertInMiddle {
    Node head;
    private int size;
    InsertInMiddle(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next = null;
        Node(String data){
            this.data= data;
            size++;
        }
    }
    public void addElementInMiddle(String data, int index) {
        Node newNode = new Node(data);
        if (size < index || index < 0) {
            System.out.println("Invalid Index");
            return;
        }
        size++;

        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;

        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
        }
    }

    public void printList() {
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    //get size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        InsertInMiddle list = new InsertInMiddle();
        list.addElementInMiddle("Pankaj", 0);
        list.addElementInMiddle("Yadav",1);
        list.printList();

        list.addElementInMiddle("Name", 0);
        list.printList();
    }
}
// End