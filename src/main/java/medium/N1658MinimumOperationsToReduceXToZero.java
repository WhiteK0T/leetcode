package medium;

import java.util.Arrays;

public class N1658MinimumOperationsToReduceXToZero {
    /*
        1658. Minimum Operations to Reduce X to Zero

        You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost
        or the rightmost element from the array nums and subtract its value from x. Note that this modifies the
        array for future operations.

        Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.

        Constraints:
            1 <= nums.length <= 105
            1 <= nums[i] <= 104
            1 <= x <= 109

        https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/?envType=daily-question&envId=2023-09-20
     */

    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;
        if (target == 0) {
            return nums.length;
        }
        int left = 0, right = 0, curr = 0, cnt = 0;
        while (right < nums.length) {
            curr += nums[right];
            while (left < right && curr > target) {
                curr -= nums[left];
                left++;
            }
            if (curr == target) {
                cnt = Math.max(cnt, right - left + 1);
            }
            right++;
        }
        return cnt == 0 ? -1 : nums.length - cnt;
    }
}