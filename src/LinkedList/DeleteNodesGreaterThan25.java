package LinkedList;

import jdk.swing.interop.DispatcherWrapper;

import java.util.Scanner;
// Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
// Delete all nodes which have values greater than 25.

// Start
public class DeleteNodesGreaterThan25 {
    Node head;
    private int size;
    DeleteNodesGreaterThan25(){
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
            return;
        }

        Node currNode = head;
        while (currNode.next!= null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // get node
    public Node get(int index) {
        Node currNode = head;
        int i = 0;
        while (currNode != null) {
            if (index == i)
                return currNode;
            currNode = currNode.next;
            i++;
        }
        return head;
    }

    // delete Node
    public void deleteNode (int index) {
        if (index > getSize()-1 || index < 0) {
            System.out.println("Index out of bound");
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
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
    //print List
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DeleteNodesGreaterThan25 list = new DeleteNodesGreaterThan25();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 51)
                list.addLast(x);
        }
        //list.deleteNode(1);

        list.printList();


        for (int i = 0; i < list.size; i++) {
            Node b = list.get(i);
            if (b.data > 25) {
                list.deleteNode(i);
                i = 0;
            }
        }
        list.printList();
    }
}

//  End