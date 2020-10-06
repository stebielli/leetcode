package it.bielli.leetcode.challenges.year2020.october;

import it.bielli.leetcode.challenges.year2020.october.Exercise6.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3485/
 */
class Exercise6Test {

    private Exercise6 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise6();
    }

    private TreeNode createBst(int[] bst) {
        if (bst == null || bst.length == 0) return null;
        return createBst(bst, 0);
    }

    private TreeNode createBst(int[] bst, int i) {
        if (i < bst.length) {
            TreeNode root = new TreeNode(bst[i]);
            root.left = createBst(bst, 2 * i + 1);
            root.right = createBst(bst, 2 * i + 2);
            return root;
        }
        return null;
    }

    private void testCase(int[] bst, int val) {
        TreeNode treeNode = ex.insertIntoBST(createBst(bst), val);
        assertNotNull(treeNode);
        assertTrue(isValidBst(treeNode));
    }

    private boolean isValidBst(TreeNode bst) {
        return bst == null ||
                ((bst.left == null || bst.left.val < bst.val && isValidBst(bst.left))
                        && (bst.right == null || bst.val < bst.right.val && isValidBst(bst.right)));
    }

    @Test
    void test1() {
        int[] bst = {4, 2, 7, 1, 3};
        int val = 5;
        testCase(bst, val);
    }
}