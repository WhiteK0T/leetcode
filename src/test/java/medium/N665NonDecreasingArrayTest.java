package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N665NonDecreasingArrayTest {

    N665NonDecreasingArray nonDecreasingArray = new N665NonDecreasingArray();

    /*
        Input: nums = [4,2,3]
        Output: true
        Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
     */
    @Test
    void checkPossibility1() {
        int[] nums = {4, 2, 3};
        boolean actual = nonDecreasingArray.checkPossibility(nums);
        assertTrue(actual);
    }

    /*
        Input: nums = [4,2,1]
        Output: false
        Explanation: You can't get a non-decreasing array by modify at most one element.
     */
    @Test
    void checkPossibility2() {
        int[] nums = {4, 2, 3};
        boolean actual = nonDecreasingArray.checkPossibility(nums);
        assertTrue(actual);
    }
}