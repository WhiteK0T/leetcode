package easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class N7ReverseIntegerTest {


    private static final N7ReverseInteger REVERSE_INTEGER = new N7ReverseInteger();

    /*  Example 1:
        Input: x = 123
        Output: 321     */
    @Test
    void reverse1() {
        int input = 123;
        int expected = 321;
        int actual = REVERSE_INTEGER.reverse(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: x = -123
        Output: -321     */
    @Test
    void reverse2() {
        int input = -123;
        int expected = -321;
        int actual = REVERSE_INTEGER.reverse(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
        Input: x = 120
        Output: 21     */
    @Test
    void reverse3() {
        int input = 120;
        int expected = 21;
        int actual = REVERSE_INTEGER.reverse(input);
        assertThat(actual, equalTo(expected));
    }
}