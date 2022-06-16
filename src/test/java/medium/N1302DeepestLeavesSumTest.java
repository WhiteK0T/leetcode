package medium;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import util.TreeNode;
import util.TreeNodeUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N1302DeepestLeavesSumTest {
    static TreeNode graph1 = TreeNodeUtil.generateGraphFromArray(new Integer[]{1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, null, null, 8});
    static TreeNode graph2 = TreeNodeUtil.generateGraphFromArray(new Integer[]{6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5});

    static N1302DeepestLeavesSum deepestLeavesSum = new N1302DeepestLeavesSum();

    /*
        Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
        Output: 15
    */

    @Test
    void deepestLeavesSum1() {
        int actual = deepestLeavesSum.deepestLeavesSum(graph1);
        assertEquals(15, actual);
    }

    /*
        Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        Output: 19
    */

    @Test
    void deepestLeavesSum2() {
        int actual = deepestLeavesSum.deepestLeavesSum(graph2);
        assertEquals(19, actual);
    }

    @Benchmark
    public void benchMark() {
        deepestLeavesSum.deepestLeavesSum(graph1);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}