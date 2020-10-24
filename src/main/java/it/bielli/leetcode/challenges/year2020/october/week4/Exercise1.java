package it.bielli.leetcode.challenges.year2020.october.week4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3504/
 */
public class Exercise1 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 1));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.treeNode.left == null && pair.treeNode.right == null) {
                return pair.depth;
            }
            if (pair.treeNode.left != null) {
                queue.add(new Pair(pair.treeNode.left, pair.depth + 1));
            }
            if (pair.treeNode.right != null) {
                queue.add(new Pair(pair.treeNode.right, pair.depth + 1));
            }
        }

        return -1;
    }

    public static class Pair {
        TreeNode treeNode;
        int depth;

        public Pair(TreeNode treeNode, int depth) {
            this.treeNode = treeNode;
            this.depth = depth;
        }

    }

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
