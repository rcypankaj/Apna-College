package LinkedList;
// delete in particular index in single linked list
// Start
public class deleteInParticularIndex {
    public Node head;
    private int size;
    deleteInParticularIndex(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
            size++;
        }
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null)
                currNode = currNode.next;

            currNode.next = newNode;
        }
    }

    // delete in particularIndex
    public void deleteData(int index) {
        if (index < 0 || index > getSize()-1) {
            System.out.println("invalid Index");
        } else if (index == 0) {
            head  = head.next;
        }
        else {
            Node currNode = head;
            if (index == getSize()-1) {
                while (currNode.next.next != null)
                    currNode = currNode.next;
                currNode.next = null;
            }
            else {
                for (int i = 0; i < index-1; i++) {
                    currNode = currNode.next;
                }
                currNode.next = currNode.next.next;
            }
        }
        size--;

    }

    // printList
    public void printList() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    //getSize
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        deleteInParticularIndex list = new deleteInParticularIndex();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

        list.deleteData(1);
        list.printList();
        System.out.println(list.getSize());

    }
}
// End
