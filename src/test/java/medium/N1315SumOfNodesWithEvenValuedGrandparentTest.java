package medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1315SumOfNodesWithEvenValuedGrandparentTest {

    N1315SumOfNodesWithEvenValuedGrandparent sumOfNodesWithEvenValuedGrandparent = new N1315SumOfNodesWithEvenValuedGrandparent();

    /*
        Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        Output: 18
        Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
     */
    @Test
    void sumEvenGrandparent1() {
        Integer[] input = {6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5};
        TreeNode root = TreeNodeUtil.generateGraphFromArray(input);
        int actual = sumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(root);
        int expected = 18;
        assertEquals(expected, actual);
    }

    /*
        Input: root = [1]
        Output: 0
     */
    @Test
    void sumEvenGrandparent2() {
        Integer[] input = {1};
        TreeNode root = TreeNodeUtil.generateGraphFromArray(input);
        int actual = sumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(root);
        int expected = 0;
        assertEquals(expected, actual);
    }
}