package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class N5LongestPalindromicSubstringTest {

    private static final N5LongestPalindromicSubstring LONGEST_PALINDROMIC_SUBSTRING = new N5LongestPalindromicSubstring();


    /*  Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.  */
    @Test
    void longestPalindrome1() {
        String input = "babad";
        String actual = LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome(input);
        assertThat(actual, oneOf("bab", "aba"));
    }

    /*  Example 2:
        Input: s = "cbbd"
        Output: "bb"      */
    @Test
    void longestPalindrome2() {
        String input = "cbbd";
        String actual = LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome(input);
        assertThat(actual, equalTo("bb"));
    }
}