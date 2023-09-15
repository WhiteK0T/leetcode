package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N1584MinCostToConnectAllPointsTest {

    public static final N1584MinCostToConnectAllPoints MIN_COST_TO_CONNECT_ALL_POINTS = new N1584MinCostToConnectAllPoints();

    /*  Example 1:
        Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
        Output: 20
        Explanation:
        https://assets.leetcode.com/uploads/2020/08/26/c.png
        We can connect the points as shown above to get the minimum cost of 20.
        Notice that there is a unique path between every pair of points.    */
    @Test
    void minCostConnectPoints1() {
        int[][] input = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        int expected = 20;
        int actual = MIN_COST_TO_CONNECT_ALL_POINTS.minCostConnectPoints(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
    Input: points = [[3,12],[-2,5],[-4,1]]
    Output: 18
    Explanation:
    https://assets.leetcode.com/uploads/2020/08/26/c.png
    We can connect the points as shown above to get the minimum cost of 20.
    Notice that there is a unique path between every pair of points.    */
    @Test
    void minCostConnectPoints2() {
        int[][] input = {{3, 12}, {-2, 5}, {-4, 1}};
        int expected = 18;
        int actual = MIN_COST_TO_CONNECT_ALL_POINTS.minCostConnectPoints(input);
        assertThat(actual, equalTo(expected));
    }
}