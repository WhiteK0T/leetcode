package medium;

import java.util.Arrays;

public class N128LongestConsecutiveSequence {

    /*
        128. Longest Consecutive Sequence

        Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
        You must write an algorithm that runs in O(n) time.

        Constraints:
            0 <= nums.length <= 105
            -109 <= nums[i] <= 109

        https://leetcode.com/problems/longest-consecutive-sequence/
     */

    public int longestConsecutive(int[] nums) {
        /*Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int count = i;
                while (set.contains(count)) {
                    count++;
                }
                max = Math.max(count - i, max);
            }
        }
        return max;*/

        if (nums.length == 0) return 0;
        int currLongest = 1;
        int longest = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                currLongest++;
            } else {
                longest = Math.max(longest, currLongest);
                currLongest = 1;
            }
        }
        return Math.max(longest, currLongest);

        /*int max = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i : nums) {
            int count = 1;

            // look left
            int num = i;
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }

            // look right
            num = i;
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }

            max = Math.max(max, count);
        }

        return max;*/
    }
}
