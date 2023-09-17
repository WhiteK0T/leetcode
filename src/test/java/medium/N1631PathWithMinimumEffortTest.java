package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N1631PathWithMinimumEffortTest {

    public static final N1631PathWithMinimumEffort PATH_WITH_MINIMUM_EFFORT = new N1631PathWithMinimumEffort();


    /*  Example 1:
        https://assets.leetcode.com/uploads/2020/10/04/ex1.png
        Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
        Output: 2
        Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
        This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.   */
    @Test
    void minimumEffortPath1() {
        int[][] input = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        int expected = 2;
        int actual = PATH_WITH_MINIMUM_EFFORT.minimumEffortPath(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        https://assets.leetcode.com/uploads/2020/10/04/ex2.png
        Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
        Output: 1
        Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, which is
        better than route [1,3,5,3,5].  */
    @Test
    void minimumEffortPath2() {
        int[][] input = new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
        int expected = 1;
        int actual = PATH_WITH_MINIMUM_EFFORT.minimumEffortPath(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
        https://assets.leetcode.com/uploads/2020/10/04/ex3.png
        Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
        Output: 0
        Explanation: This route does not require any effort.  */
    @Test
    void minimumEffortPath3() {
        int[][] input = new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}};
        int expected = 0;
        int actual = PATH_WITH_MINIMUM_EFFORT.minimumEffortPath(input);
        assertThat(actual, equalTo(expected));
    }
}