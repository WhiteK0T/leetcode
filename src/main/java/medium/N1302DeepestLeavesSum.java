package medium;

import javafx.util.Pair;
import util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class N1302DeepestLeavesSum {

    /*
        1302. Deepest Leaves Sum
        Given the root of a binary tree, return the sum of values of its deepest leaves.

        https://leetcode.com/problems/deepest-leaves-sum/
     */

    private int maxDepth = 0;
    private int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        //return dls(root, 1).getValue();
        //return deepestLeavesSumSuleimanov(root);
        if (root == null) return 0;
        dls_v2(root,0);
        return sum;
    }

    private void dls_v2(TreeNode root, int currentDepth){
        if (root == null) return;
        if (currentDepth > maxDepth){
            sum = 0;
            maxDepth = currentDepth;
        }
        if (currentDepth == maxDepth){
            sum = sum + root.val;
        }
        dls_v2(root.left, currentDepth + 1);
        dls_v2(root.right, currentDepth + 1);
    }

    private Pair<Integer, Integer> dls_v1(TreeNode root, int currentDepth) {
        if (root.right == null && root.left == null) {
            return new Pair<>(currentDepth, root.val);
        }
        Pair<Integer, Integer> right = null;
        if (root.right != null) {
            right = dls_v1(root.right, currentDepth + 1);
        }
        Pair<Integer, Integer> left = null;
        if (root.left != null) {
            left = dls_v1(root.left, currentDepth + 1);
        }
        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }

        if (right.getKey() > left.getKey()) {
            return right;
        }
        if (right.getKey() < left.getKey()) {
            return left;
        }
        return new Pair<>(right.getKey(), right.getValue() + left.getValue());
    }

    public int deepestLeavesSumSuleimanov(TreeNode root) {
        int currentDepth;
        int maxDepth = 0;
        int maxDepthSum = 0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
        stack.add(new Pair<>(root, 0));
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> p = stack.pop();
            root = p.getKey();
            currentDepth = p.getValue();

            if (root.right != null) {
                stack.push(new Pair<>(root.right, currentDepth + 1));
            }
            if (root.left != null) {
                stack.push(new Pair<>(root.left, currentDepth + 1));
            }
            if (root.right == null && root.left == null) {
                if (maxDepth < currentDepth) {
                    maxDepth = currentDepth;
                    maxDepthSum = root.val;
                } else if (maxDepth == currentDepth) {
                    maxDepthSum += root.val;
                }
            }
        }
        return maxDepthSum;
    }
}
