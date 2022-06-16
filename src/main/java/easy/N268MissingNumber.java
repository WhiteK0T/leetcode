package easy;

public class N268MissingNumber {
    /*
        268. Missing Number
        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
        https://leetcode.com/problems/missing-number/

        Constraints:
            n == nums.length
            1 <= n <= 10 в 4 степени
            0 <= nums[i] <= n
            All the numbers of nums are unique.
    */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i : nums) {
            sum2 += i;
        }
        return sum - sum2;
    }
}
