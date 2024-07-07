package easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class N1518WaterBottlesTest {

    public static final N1518WaterBottles WATER_BOTTLES = new N1518WaterBottles();

    /*  Example 1:
        Input: numBottles = 9, numExchange = 3
        Output: 13
        Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
        Number of water bottles you can drink: 9 + 3 + 1 = 13.
        https://assets.leetcode.com/uploads/2020/07/01/sample_1_1875.png      */
    @Test
    void numWaterBottles1() {
        int numBottles = 9;
        int numExchange = 3;
        int actual = WATER_BOTTLES.numWaterBottles(numBottles, numExchange);
        int expected = 13;
        assertThat(actual, is(equalTo(expected)));
    }

    /*  Example 2:
        Input: numBottles = 15, numExchange = 4
        Output: 19
        Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
        Number of water bottles you can drink: 15 + 3 + 1 = 19.
        https://assets.leetcode.com/uploads/2020/07/01/sample_2_1875.png      */
    @Test
    void numWaterBottles2() {
        int numBottles = 15;
        int numExchange = 4;
        int actual = WATER_BOTTLES.numWaterBottles(numBottles, numExchange);
        int expected = 19;
        assertThat(actual, is(equalTo(expected)));
    }

    /*  Example 3:
        Input: numBottles = 15, numExchange = 8
        Output: 16      */
    @Test
    void numWaterBottles3() {
        int numBottles = 15;
        int numExchange = 8;
        int actual = WATER_BOTTLES.numWaterBottles(numBottles, numExchange);
        int expected = 17;
        assertThat(actual, is(equalTo(expected)));
    }

    /*  Example 4:
        Input: numBottles = 17, numExchange = 3
        Output: 25      */
    @Test
    void numWaterBottles4() {
        int numBottles = 17;
        int numExchange = 3;
        int actual = WATER_BOTTLES.numWaterBottles(numBottles, numExchange);
        int expected = 25;
        assertThat(actual, is(equalTo(expected)));
    }
}