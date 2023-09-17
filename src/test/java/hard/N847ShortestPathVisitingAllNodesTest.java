package hard;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class N847ShortestPathVisitingAllNodesTest {

    public static final N847ShortestPathVisitingAllNodes SHORTEST_PATH_VISITING_ALL_NODES = new N847ShortestPathVisitingAllNodes();

    /* Example 1:
        https://assets.leetcode.com/uploads/2021/05/12/shortest1-graph.jpg
        Input: graph = [[1,2,3],[0],[0],[0]]
        Output: 4
        Explanation: One possible path is [1,0,2,0,3]   */
    @Test
    void shortestPathLength1() {
        int[][] input = new int[][]{{1, 2, 3}, {0}, {0}, {0}};
        int expected = 4;
        int actual = SHORTEST_PATH_VISITING_ALL_NODES.shortestPathLength(input);
        assertThat(actual, equalTo(expected));
    }

    /* Example 2:
        https://assets.leetcode.com/uploads/2021/05/12/shortest2-graph.jpg
        Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
        Output: 4
        Explanation: One possible path is [0,1,4,2,3]   */
    @Test
    void shortestPathLength2() {
        int[][] input = new int[][]{{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}};
        int expected = 4;
        int actual = SHORTEST_PATH_VISITING_ALL_NODES.shortestPathLength(input);
        assertThat(actual, equalTo(expected));
    }
}