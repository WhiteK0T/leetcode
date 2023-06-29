package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N14LongestCommonPrefixTest {

    private final N14LongestCommonPrefix longestCommonPrefix = new N14LongestCommonPrefix();

    /*
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
     */
    @Test
    void longestCommonPrefix1() {
        String[] strs = {"flower", "flow", "flight"};
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        String expected = "fl";
        assertEquals(expected, actual);
    }

    /*
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
     */
    @Test
    void longestCommonPrefix2() {
        String[] strs = {"dog","racecar","car"};
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        String expected = "";
        assertEquals(expected, actual);
    }
}