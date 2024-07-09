package linkedlist;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode current = head; // 4 -> null
        while (current.next != null) {
            length++;
            current = current.next;

        }

        if (length == 0) {
            return head;
        }

         k = k % length;
        if (k == 0) {
            return head;
        }

        int newTailPosition = length - k;
        current.next = head;

        for (int i = 0; i < newTailPosition; i++) {
            current = current.next;
        }

        ListNode newNode = current.next;
        current.next = null;

        return newNode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ListNode afterRotate = rotateRight(node, 7);

        while (afterRotate != null){
            System.out.println(afterRotate.val + " ");
            afterRotate = afterRotate.next;
        }
    }

}
