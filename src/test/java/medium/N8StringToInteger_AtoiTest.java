package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

class N8StringToInteger_AtoiTest {

    public static final N8StringToInteger_Atoi STRING_TO_INTEGER_ATOI = new N8StringToInteger_Atoi();

    /*  Example 1:
        Input: s = "42"
        Output: 42
        Explanation:
        The underlined characters are what is read in and the caret is the current reader position.
        Step 1: "42" (no characters read because there is no leading whitespace)
                 ^
        Step 2: "42" (no characters read because there is neither a '-' nor '+')
                 ^
        Step 3: "42" ("42" is read in)
                 ^      */
    @Test
    void myAtoi1() {
        String s = "42";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 42;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 2:
        Input: s = " -042"
        Output: -42
        Explanation:
        Step 1: "   -042" (leading whitespace is read and ignored)
                      ^
        Step 2: "   -042" ('-' is read, so the result should be negative)
                      ^
        Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
                      ^     */
    @Test
    void myAtoi2() {
        String s = " -042";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = -42;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 3:
        Input: s = "1337c0d3"
        Output: 1337
        Explanation:
        Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
                    ^
        Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
                    ^
        Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
                    ^       */
    @Test
    void myAtoi3() {
        String s = "1337c0d3";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 1337;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 4:
        Input: s = "0-1"
        Output: 0
        Explanation:
        Step 1: "0-1" (no characters read because there is no leading whitespace)
                 ^
        Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
                 ^
        Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
                 ^      */
    @Test
    void myAtoi4() {
        String s = "0-1";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 0;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 5:
        Input: s = "words and 987"
        Output: 0
        Explanation:
        Reading stops at the first non-digit character 'w'.     */
    @Test
    void myAtoi5() {
        String s = "words and 987";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 0;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 6:
        Input: s = "9223372036854775808"
        Output: 2147483647                 */
    @Test
    void myAtoi6() {
        String s = "9223372036854775808";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 2147483647;
        assertThat(actual, comparesEqualTo(expected));
    }

    /*  Example 7:
        Input: s = "18446744073709551617"
        Output: 2147483647                 */
    @Test
    void myAtoi7() {
        String s = "18446744073709551617";
        int actual = STRING_TO_INTEGER_ATOI.myAtoi(s);
        int expected = 2147483647;
        assertThat(actual, comparesEqualTo(expected));
    }
}