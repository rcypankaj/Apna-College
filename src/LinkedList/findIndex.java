package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
/* Question Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
    Search for the number 7 & display its index. */
// Start
public class findIndex {
    Node head;
    static class Node{
        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
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

    // print list
    public int findNumber(int x) {
        if (head == null){
            return -1;
        }
        Node currNode = head;

        int  i = 0;
        while (currNode != null) {
            if (currNode.data == x)
                return i;
            currNode = currNode.next;
            i++;
        }
        return -1;
    }
    /*public static int findIndexNumber(LinkedList<Integer> list, int n, int data){
        for (int i = 0; i < n; i++) {
            if (data == list.get(i)) {
                return i;
            }
        }
        return -1;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // input size of the linked list
        int n = sc.nextInt();

        // for (int i = 0; i < n; i++)
        //    list.add(sc.nextInt());

        int data = sc.nextInt();

        // System.out.println(findIndexNumber(list, n, data));

        // 2nd Way to solve this question

        findIndex list2 = new findIndex();

        for (int i = 0; i < n; i++)
            list2.addLast(sc.nextInt());

        System.out.println(list2.findNumber(data));

    }
}
// End