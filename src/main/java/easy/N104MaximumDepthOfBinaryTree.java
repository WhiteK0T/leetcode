package easy;

import util.TreeNode;

public class N104MaximumDepthOfBinaryTree {

    /*
        104. Maximum Depth of Binary Tree
        Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeftDepth = maxDepth(root.left);
        int maxRightDepth = maxDepth(root.right);
        return maxLeftDepth > maxRightDepth ? maxLeftDepth + 1 : maxRightDepth + 1;
    }
}
