package medium;

public class N665NonDecreasingArray {

    /*
        665. Non-decreasing Array

        Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.
        We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

        Constraints:

            n == nums.length
            1 <= n <= 10 v 4
            -10 v 5 <= nums[i] <= 10 v 5

     */

    public boolean checkPossibility(int[] nums) {
        for (int i = 1, err = 0; i < nums.length; i++)
            if (nums[i] < nums[i - 1])
                if (err++ > 0 ||
                    (i > 1 && i < nums.length - 1 && nums[i - 2] > nums[i] && nums[i + 1] < nums[i - 1]))
                    return false;
        return true;
    }
}
