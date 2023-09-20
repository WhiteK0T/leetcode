package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N1658MinimumOperationsToReduceXToZeroTest {

    private static final N1658MinimumOperationsToReduceXToZero MINIMUM_OPERATIONS_TO_REDUCE_X_TO_ZERO = new N1658MinimumOperationsToReduceXToZero();


    /*  Example 1:
        Input: nums = [1,1,4,2,3], x = 5
        Output: 2
        Explanation: The optimal solution is to remove the last two elements to reduce x to zero.   */
    @Test
    void minOperations1() {
        int[] input = {1, 1, 4, 2, 3};
        int x = 5;
        int expected = 2;
        int actual = MINIMUM_OPERATIONS_TO_REDUCE_X_TO_ZERO.minOperations(input, x);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: nums = [5,6,7,8,9], x = 4
        Output: -1   */
    @Test
    void minOperations2() {
        int[] input = {5, 6, 7, 8, 9};
        int x = 4;
        int expected = -1;
        int actual = MINIMUM_OPERATIONS_TO_REDUCE_X_TO_ZERO.minOperations(input, x);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
        Input: nums = [3,2,20,1,1,3], x = 10
        Output: 5
        Explanation: The optimal solution is to remove the last three elements and the first two elements
        (5 operations in total) to reduce x to zero.   */
    @Test
    void minOperations3() {
        int[] input = {3, 2, 20, 1, 1, 3};
        int x = 10;
        int expected = 5;
        int actual = MINIMUM_OPERATIONS_TO_REDUCE_X_TO_ZERO.minOperations(input, x);
        assertThat(actual, equalTo(expected));
    }
}