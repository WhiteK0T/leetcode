package hard;

public class N4MedianOfTwoSortedArrays {

    /*
        4. Median of Two Sorted Arrays

        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        https://leetcode.com/problems/median-of-two-sorted-arrays/

        Constraints:
            nums1.length == m
            nums2.length == n
            0 <= m <= 1000
            0 <= n <= 1000
            1 <= m + n <= 2000
            -10 v 6 <= nums1[i], nums2[i] <= 10 v 6
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int total = nums1.length + nums2.length;
        int start = 0;
        int end = nums1.length;
        while (start <= end) {
            int i1 = (start + end) / 2;     //num1
            int i2 = (total + 1) / 2 - i1;  //num2
            int left1 = i1 == 0 ? Integer.MIN_VALUE : nums1[i1 - 1];
            int right1 = i1 == nums1.length ? Integer.MAX_VALUE : nums1[i1];
            int left2 = i2 == 0 ? Integer.MIN_VALUE : nums2[i2 - 1];
            int right2 = i2 == nums2.length ? Integer.MAX_VALUE : nums2[i2];

            if (left1 <= right2 && left2 <= right1) {
                if (total % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
                return Math.max(left1, left2);
            } else if (left1 > right2) {
                end = i1 - 1;
            } else {
                start = i1 + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
