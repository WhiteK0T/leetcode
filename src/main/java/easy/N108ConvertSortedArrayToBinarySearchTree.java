package easy;

import util.TreeNode;

public class N108ConvertSortedArrayToBinarySearchTree {

    /*
        108. Convert Sorted Array to Binary Search Tree

        Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
        A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
        https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

        Constraints:

            1 <= nums.length <= 10 v 4
            -10 v 4 <= nums[i] <= 10 v 4
            nums is sorted in a strictly increasing order.
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1);
        midNode.right = buildSubBST(nums, mid + 1, end);
        return midNode;
    }
}
