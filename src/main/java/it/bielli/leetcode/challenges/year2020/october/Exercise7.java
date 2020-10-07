package it.bielli.leetcode.challenges.year2020.october;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/
 */
public class Exercise7 {

    static class ListNode {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }

        int size = countSize(head);
        int rotationIndex = size - k % size;
        if (rotationIndex == size) {
            return head;
        }
        ListNode finalNode = findNode(head, size - 1);
        ListNode lastNode = findNode(head, rotationIndex - 1);
        ListNode rotationNode = lastNode.next;
        finalNode.next = head;
        lastNode.next = null;
        return rotationNode;
    }

    private int countSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    private ListNode findNode(ListNode head, int index) {
        for (int i = 0; i < index; i++)
            head = head.next;
        return head;
    }

}
