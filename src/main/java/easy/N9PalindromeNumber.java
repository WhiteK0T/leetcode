package easy;

public class N9PalindromeNumber {
    /*
        9. Palindrome Number

        Given an integer x, return true if x is a palindrome , and false otherwise.

        Constraints:
        -231 <= x <= 231 - 1

        Follow up: Could you solve it without converting the integer to a string?

        https://leetcode.com/problems/palindrome-number/
     */

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == x);
    }
}
