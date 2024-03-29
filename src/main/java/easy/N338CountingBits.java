package easy;

public class N338CountingBits {
    /*
        338. Counting Bits

        Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the
        number of 1's in the binary representation of i.

        Constraints:
            0 <= n <= 105

        Follow up:
            It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n)
            and possibly in a single pass?
            Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?

        https://leetcode.com/problems/counting-bits/?envType=daily-question&envId=2023-09-01
     */

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Если i четное число, количество установленных битов такое же, как и i/2
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            }
            // Если i нечетное число, количество установленных битов на единицу больше, чем i/2
            else {
                ans[i] = ans[i / 2] + 1;
            }
        }
        return ans;
    }
}