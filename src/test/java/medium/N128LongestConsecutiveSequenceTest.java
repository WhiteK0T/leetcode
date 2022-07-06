package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N128LongestConsecutiveSequenceTest {

    N128LongestConsecutiveSequence longestConsecutiveSequence = new N128LongestConsecutiveSequence();

    /*
        Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     */
    @Test
    void longestConsecutive1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int actual = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(4, actual);
    }

    /*
        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9
     */
    @Test
    void longestConsecutive2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int actual = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(9, actual);
    }
}