package easy;

public class N136SingleNumber {
    /*
        136.Single Number
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

        https://leetcode.com/problems/single-number/
    */

    // x XOR x = 0    0 XOR x = x
    // x ^ x = 0      0 ^ x = x
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a ^= n;
        }
        return a;
    }
}
