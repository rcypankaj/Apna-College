package LinkedList;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/swap-nodes-in-pairs/
// Start
public class SwapNodesInPairs {
    public ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode (int val){
            this.val = val;
        }
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    //add Last
    public void addLast (int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        }

        else {
            ListNode currNpde = head;

            while (currNpde .next != null)
                currNpde  = currNpde.next;

            currNpde.next = newNode;
        }

    }

    //print List
    public void printList() {
        if (head == null) {
            System.out.println("Nothing to print");
        }

        else {
            ListNode currNode = head;
            while (currNode != null) {
                System.out.print(currNode.val+" -> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prevNode = dummy, currNode = head;
        dummy.next = head;

        while (currNode != null && currNode.next != null) {
            prevNode.next = currNode.next;
            currNode.next = currNode.next.next;
            prevNode.next.next = currNode;

            //update
            currNode = currNode.next;
            prevNode = prevNode.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapNodesInPairs list = new SwapNodesInPairs();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        list.printList();

        list.head = list.swapPairs(list.head);

        list.printList();
    }
}

// End