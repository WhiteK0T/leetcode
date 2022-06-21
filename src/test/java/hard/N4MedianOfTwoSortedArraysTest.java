package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N4MedianOfTwoSortedArraysTest {

    N4MedianOfTwoSortedArrays medianOfTwoSortedArrays = new N4MedianOfTwoSortedArrays();

    /*
        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.
     */
    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        double expected = 2;
        assertEquals(expected, actual);
    }

    /*
        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */
    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5;
        assertEquals(expected, actual);
    }
}