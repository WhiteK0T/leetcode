package easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N108ConvertSortedArrayToBinarySearchTreeTest {

    private final N108ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new N108ConvertSortedArrayToBinarySearchTree();

    /*
        Input: nums = [-10,-3,0,5,9]
        Output: [0,-3,9,-10,null,5]
        Explanation: [0,-10,5,null,-3,null,9] is also accepted:
     */
    @Test
    void sortedArrayToBST1() {
        int[] input = {-10, -3, 0, 5, 9};
        TreeNode actual = convertSortedArrayToBinarySearchTree.sortedArrayToBST(input);
        Integer[] output = {0, -10, 5, null, -3, null, 9};
        TreeNode expected = TreeNodeUtil.generateGraphFromArray(output);
        assertTrue(TreeNodeUtil.equalsBFS(expected, actual));
    }

    /*
        Input: nums = [1,3]
        Output: [3,1]
        Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     */
    @Test
    void sortedArrayToBST2() {
        int[] input = {1, 3};
        TreeNode actual = convertSortedArrayToBinarySearchTree.sortedArrayToBST(input);
        Integer[] output = {1, null, 3};
        TreeNode expected = TreeNodeUtil.generateGraphFromArray(output);
        assertTrue(TreeNodeUtil.equalsBFS(expected, actual));
    }
}