package medium;

import util.TreeNode;

public class N1315SumOfNodesWithEvenValuedGrandparent {

    /*
        1315. Sum of Nodes with Even-Valued Grandparent
        Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent.
        If there are no nodes with an even-valued grandparent, return 0.
        A grandparent of a node is the parent of its parent if it exists.

        Constraints:

            The number of nodes in the tree is in the range [1, 104].
            1 <= Node.val <= 100

        https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
     */

    /*
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public int sumEvenGrandparent(TreeNode root) {
        return calculateSubSum(root, -1, -1);
    }

    private int calculateSubSum(TreeNode node, int parentValue, int grandParentValue) {
        int result = 0;
        if (grandParentValue % 2 == 0) {
            result += node.val;
        }
        if (node.left != null) {
            result += calculateSubSum(node.left, node.val, parentValue);
        }
        if (node.right != null) {
            result += calculateSubSum(node.right, node.val, parentValue);
        }
        return result;
    }
}
