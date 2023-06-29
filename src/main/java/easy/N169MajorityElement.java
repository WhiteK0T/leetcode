package easy;

import java.util.HashMap;

public class N169MajorityElement {
    /*
        169. Majority Element

        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority
        element always exists in the array.

        Constraints:
            n == nums.length
            1 <= n <= 5 * 104
            -109 <= nums[i] <= 109

        Follow-up: Could you solve the problem in linear time and in O(1) space?

        https://leetcode.com/problems/majority-element/
     */

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int result = 0;

        for (int num : nums) {
            Integer merge = map.merge(num, 1, Integer::sum);
            if (maxCount < merge) {
                maxCount = merge;
                result = num;
            }
        }
        return result;

/*
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            if (num == result) {
                count++;
            } else {
                count--;
            }
        }
        return result;
*/
    }
}