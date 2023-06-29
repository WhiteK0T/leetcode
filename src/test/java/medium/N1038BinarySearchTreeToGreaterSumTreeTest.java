package medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N1038BinarySearchTreeToGreaterSumTreeTest {

    private final N1038BinarySearchTreeToGreaterSumTree binarySearchTreeToGreaterSumTree = new N1038BinarySearchTreeToGreaterSumTree();

    /*
        Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
     */
    @Test
    void bstToGst1() {
        Integer[] t1 = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode actual = binarySearchTreeToGreaterSumTree.bstToGst(TreeNodeUtil.generateGraphFromArray(t1));
        Integer[] t2 = {30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8};
        TreeNode expected = TreeNodeUtil.generateGraphFromArray(t2);
        assertTrue(TreeNodeUtil.equalsBFS(actual, expected));
    }

    /*
        Input: root = [0,null,1]
        Output: [1,null,1]
     */
    @Test
    void bstToGst2() {
        Integer[] t1 = {0, null, 1};
        TreeNode actual = binarySearchTreeToGreaterSumTree.bstToGst(TreeNodeUtil.generateGraphFromArray(t1));
        Integer[] t2 = {1, null, 1};
        TreeNode expected = TreeNodeUtil.generateGraphFromArray(t2);
        assertTrue(TreeNodeUtil.equalsBFS(actual, expected));
    }
}