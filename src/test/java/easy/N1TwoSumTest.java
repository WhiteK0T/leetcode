package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N1TwoSumTest {

    private final N1TwoSum twoSum = new N1TwoSum();

    /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    void twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
     */
    @Test
    void twoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {1, 2};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: nums = [3,3], target = 6
        Output: [0,1]
     */
    @Test
    void twoSum3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }

    /*
        [2,5,5,11]
        10
     */
    @Test
    void twoSum4() {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {1, 2};
        assertArrayEquals(expected, actual);
    }
}