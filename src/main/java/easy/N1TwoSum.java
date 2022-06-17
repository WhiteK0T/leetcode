package easy;

import java.util.HashMap;

public class N1TwoSum {
    /*
        1. Two Sum
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Constraints:

        2 <= nums.length <= 10 в 4 степени
        -10 в 9 степени <= nums[i] <= 10 в 9 степени
        -10 в 9 степени <= target <= 10 в 9 степени
        Only one valid answer exists.

        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

        https://leetcode.com/problems/two-sum/
     */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Integer numberFromMap;
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            numberFromMap = map.get(requiredNumber);
            if (numberFromMap != null && numberFromMap != i) {
                return new int[]{i, map.get(requiredNumber)};
            }
        }
        return new int[]{};
    }
}
