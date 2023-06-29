package easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N104MaximumDepthOfBinaryTreeTest {

    private final N104MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new N104MaximumDepthOfBinaryTree();

    /*
        Input: root = [3,9,20,null,null,15,7]
        Output: 3
    */
    @Test
    void maxDepth1() {
        Integer[] srez = {3, 9, 20, null, null, 15, 7};
        TreeNode graph = TreeNodeUtil.generateGraphFromArray(srez);
        int actual = maximumDepthOfBinaryTree.maxDepth(graph);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /*
        Input: root = [1,null,2]
        Output: 2
     */
    @Test
    void maxDepth2() {
        Integer[] srez = {1, null, 2};
        TreeNode graph = TreeNodeUtil.generateGraphFromArray(srez);
        int actual = maximumDepthOfBinaryTree.maxDepth(graph);
        int expected = 2;
        assertEquals(expected, actual);
    }
}