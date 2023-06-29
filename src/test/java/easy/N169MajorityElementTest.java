package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N169MajorityElementTest {

    private final N169MajorityElement n169MajorityElement = new N169MajorityElement();

    /*  Example 1:
        Input: nums = [3,2,3]
        Output: 3       */
    @Test
    void majorityElement1() {
        int[] nums = {3, 2, 3};
        int actual = n169MajorityElement.majorityElement(nums);
        assertEquals(3, actual);
    }

    /*  Example 1:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2      */
    @Test
    void majorityElement2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int actual = n169MajorityElement.majorityElement(nums);
        assertEquals(2, actual);
    }
}