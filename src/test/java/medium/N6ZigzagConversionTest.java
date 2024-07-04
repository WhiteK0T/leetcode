package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


class N6ZigzagConversionTest {

    public static final N6ZigzagConversion ZIGZAG_CONVERSION = new N6ZigzagConversion();

    /*  Example 1:
        Input: s = "PAYPALISHIRING", numRows = 3
        Output: "PAHNAPLSIIGYIR"    */
    @Test
    void convert1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String actual = ZIGZAG_CONVERSION.convert(s, numRows);
        String expected = "PAHNAPLSIIGYIR";
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
            Input: s = "PAYPALISHIRING", numRows = 4
            Output: "PINALSIGYAHRPI"
            Explanation:
            P     I    N
            A   L S  I G
            Y A   H R
            P     I    */
    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String actual = ZIGZAG_CONVERSION.convert(s, numRows);
        String expected = "PINALSIGYAHRPI";
        assertThat(actual, equalTo(expected));
    }

    /*  Example 3:
            Input: s = "A", numRows = 1
            Output: "A"    */
    @Test
    void convert3() {
        String s = "A";
        int numRows = 1;
        String actual = ZIGZAG_CONVERSION.convert(s, numRows);
        String expected = "A";
        assertThat(actual, equalTo(expected));
    }
}