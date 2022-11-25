package LinkedList;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
// Start
public class RemoveNthNodeFromEndOfList extends SwapNodesInPairs {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy, fast = dummy;
        dummy.next = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        int index = sc.nextInt();

        list.head = list.removeNthFromEnd(list.head, index);

        list.printList();

    }
}

// End