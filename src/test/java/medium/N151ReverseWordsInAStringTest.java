package medium;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N151ReverseWordsInAStringTest {

    private final static N151ReverseWordsInAString reverseWordsInAString = new N151ReverseWordsInAString();

/*  Example 1:
    Input: s = "the sky is blue"
    Output: "blue is sky the"   */
    @Test
    void reverseWords1() {
        String s = "the sky is blue";
        String expected = "blue is sky the";
        String actual = reverseWordsInAString.reverseWords(s);
        assertEquals(expected, actual);
    }

/*  Example 2:
    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.   */
    @Test
    void reverseWords2() {
        String s = "  hello world  ";
        String expected = "world hello";
        String actual = reverseWordsInAString.reverseWords(s);
        assertEquals(expected, actual);
    }

    /*  Example 3:
    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.   */
    @Test
    void reverseWords3() {
        String s = "a good   example";
        String expected = "example good a";
        String actual = reverseWordsInAString.reverseWords(s);
        assertEquals(expected, actual);
    }

    @Benchmark
    public String benchMark() {
        return reverseWordsInAString.reverseWords("  the  sky is blue   syka");
    }
    @Benchmark
    public String benchMarkFirst() {
        return reverseWordsInAString.reverseWordsFirst("  the  sky is blue   syka");
    }
    @Benchmark
    public String benchMarkRegXep() {
        return reverseWordsInAString.reverseWordsRegExp("  the  sky is blue   syka");
    }

}