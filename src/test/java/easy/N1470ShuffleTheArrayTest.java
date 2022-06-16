package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N1470ShuffleTheArrayTest {

    N1470ShuffleTheArray shuffleTheArray = new N1470ShuffleTheArray();

    /*
        Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     */
    @Test
    void shuffle1() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] actual = shuffleTheArray.shuffle(nums, 3);
        int[] expected = {2, 3, 5, 4, 1, 7};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: nums = [1,2,3,4,4,3,2,1], n = 4
        Output: [1,4,2,3,3,2,4,1]
     */
    @Test
    void shuffle2() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] actual = shuffleTheArray.shuffle(nums, 4);
        int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: nums = [1,1,2,2], n = 2
        Output: [1,2,1,2]
     */
    @Test
    void shuffle3() {
        int[] nums = {1, 1, 2, 2};
        int[] actual = shuffleTheArray.shuffle(nums, 2);
        int[] expected = {1, 2, 1, 2};
        assertArrayEquals(expected, actual);
    }
}