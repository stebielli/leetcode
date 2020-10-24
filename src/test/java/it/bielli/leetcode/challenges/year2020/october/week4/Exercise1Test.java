package it.bielli.leetcode.challenges.year2020.october.week4;

import it.bielli.leetcode.challenges.year2020.october.week4.Exercise1.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3504/
 */
class Exercise1Test {

    private Exercise1 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise1();
    }

    private TreeNode createBst(int[] bst) {
        if (bst == null || bst.length == 0) return null;
        return createBst(bst, 0);
    }

    private TreeNode createBst(int[] bst, int i) {
        if (i < bst.length) {
            if (bst[i] != -1) {
                TreeNode root = new TreeNode(bst[i]);
                root.left = createBst(bst, 2 * i + 1);
                root.right = createBst(bst, 2 * i + 2);
                return root;
            }
        }
        return null;
    }

    private void testCase(int[] bst, int output) {
        assertEquals(output, ex.minDepth(createBst(bst)));
    }

    @Test
    void test1() {
        int[] bst = {4};
        int output = 1;
        testCase(bst, output);
    }

    @Test
    void test2() {
        int[] bst = {3, 9, 20};
        int output = 2;
        testCase(bst, output);
    }

    @Test
    void test3() {
        int[] bst = {2, -1, 3, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, 5};
        int output = 4;
        testCase(bst, output);
    }

}
