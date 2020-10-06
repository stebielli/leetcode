package it.bielli.leetcode.challenges.year2020.october;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3485/
 */
public class Exercise6 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            TreeNode treeNode = insertIntoBST(root.left, val);
            if (root.left == null) {
                root.left = treeNode;
            }
        }
        if (root.val < val) {
            TreeNode treeNode = insertIntoBST(root.right, val);
            if (root.right == null) {
                root.right = treeNode;
            }
        }
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
