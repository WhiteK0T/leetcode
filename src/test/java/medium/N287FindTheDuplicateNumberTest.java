package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N287FindTheDuplicateNumberTest {

    private static final N287FindTheDuplicateNumber FIND_THE_DUPLICATE_NUMBER = new N287FindTheDuplicateNumber();

    /*  Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2   */
    @Test
    void findDuplicate1() {
        int[] input = {1, 3, 4, 2, 2};
        int expected = 2;
        int actual = FIND_THE_DUPLICATE_NUMBER.findDuplicate(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: nums = [3,1,3,4,2]
        Output: 3
   */
    @Test
    void findDuplicate2() {
        int[] input = {3, 1, 3, 4, 2};
        int expected = 3;
        int actual = FIND_THE_DUPLICATE_NUMBER.findDuplicate(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
        Input: nums = [2,2,2,2,2]
        Output: 2
   */
    @Test
    void findDuplicate3() {
        int[] input = {2, 2, 2, 2, 2};
        int expected = 2;
        int actual = FIND_THE_DUPLICATE_NUMBER.findDuplicate(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 4:
        Input: nums = [2,5,9,6,9,3,8,9,7,1]
        Output: 9
   */
    @Test
    void findDuplicate4() {
        int[] input = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        int expected = 9;
        int actual = FIND_THE_DUPLICATE_NUMBER.findDuplicate(input);
        assertThat(actual, equalTo(expected));
    }
}