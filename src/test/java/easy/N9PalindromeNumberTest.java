package easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


class N9PalindromeNumberTest {

    private static final N9PalindromeNumber PALINDROME_NUMBER = new N9PalindromeNumber();

    /*  Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.     */
    @Test
    void isPalindrome1() {
        int input = 121;
        boolean expected = true;
        boolean actual = PALINDROME_NUMBER.isPalindrome(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.     */
    @Test
    void isPalindrome2() {
        int input = -121;
        boolean expected = false;
        boolean actual = PALINDROME_NUMBER.isPalindrome(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.     */
    @Test
    void isPalindrome3() {
        int input = 10;
        boolean expected = false;
        boolean actual = PALINDROME_NUMBER.isPalindrome(input);
        assertThat(actual, equalTo(expected));
    }
}