package LinkedList;

import java.util.Scanner;
// Reverse LinkedList by Recursive method
// Start
public class ReversebyRecursion {
    Node head;
    private int size;
    ReversebyRecursion(){
        size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

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

    // reverse
    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReversebyRecursion list = new ReversebyRecursion();
        //list.printList();



        for (int i = 0; i < n; i++)
            list.addLast(sc.nextInt());

        list.printList();

        list.head = list.reverse(list.head);

        list.printList();
    }
}

// End