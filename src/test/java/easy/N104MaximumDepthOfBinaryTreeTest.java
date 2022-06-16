package easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N104MaximumDepthOfBinaryTreeTest {

    N104MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new N104MaximumDepthOfBinaryTree();

    TreeNode graph1 = TreeNodeUtil.generateGraphFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
    TreeNode graph2 = TreeNodeUtil.generateGraphFromArray(new Integer[]{1, null, 2});

    /*
        Input: root = [3,9,20,null,null,15,7]
        Output: 3
    */

    @Test
    void maxDepth1() {
        int actual = maximumDepthOfBinaryTree.maxDepth(graph1);
        assertEquals(3, actual);
    }

    /*
        Input: root = [1,null,2]
        Output: 2
     */

    @Test
    void maxDepth2() {
        int actual = maximumDepthOfBinaryTree.maxDepth(graph2);
        assertEquals(2, actual);
    }
}