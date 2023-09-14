package easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N338CountingBitsTest {

    private final static N338CountingBits COUNTING_BITS = new N338CountingBits();

    /*  Example 1:
        Input: n = 2
        Output: [0,1,1]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10    */
    @Test
    void countBits1() {
        int input = 2;
        int[] expected = new int[]{0, 1, 1};
        int[] actual = COUNTING_BITS.countBits(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: n = 5
        Output: [0,1,1,2,1,2]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10
        3 --> 11
        4 --> 100
        5 --> 101    */
    @Test
    void countBits2() {
        int input = 5;
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};
        int[] actual = COUNTING_BITS.countBits(input);
        assertThat(actual, equalTo(expected));
    }
}