package it.bielli.leetcode.challenges.year2020.october;

import it.bielli.leetcode.challenges.year2020.october.Exercise7.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/
 */
class Exercise7Test {

    private Exercise7 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise7();
    }

    private void testCase(int[] list, int k, int[] output) {
        ListNode listNode = ex.rotateRight(toListNode(list), k);
        assertArrayEquals(output, toArray(listNode));
    }

    private ListNode toListNode(int[] list) {
        ListNode root = null, head = null;
        for (int i : list) {
            ListNode node = new ListNode(i);
            if (root == null) {
                root = head = node;
            } else {
                head.next = node;
                head = node;
            }
        }
        return root;
    }

    private int[] toArray(ListNode listNode) {
        ListNode head = listNode;
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }

        int[] array = new int[i];
        i = 0;
        head = listNode;
        while (head != null) {
            array[i] = head.val;
            i++;
            head = head.next;
        }

        return array;
    }

    @Test
    void test1() {
        int[] list = {1, 2, 3, 4, 5};
        int k = 2;
        int[] output = {4, 5, 1, 2, 3};
        testCase(list, k, output);
    }

    @Test
    void test2() {
        int[] list = {1};
        int k = 1;
        int[] output = {1};
        testCase(list, k, output);
    }

    @Test
    void test3() {
        int[] list = {};
        int k = 0;
        int[] output = {};
        testCase(list, k, output);
    }
}