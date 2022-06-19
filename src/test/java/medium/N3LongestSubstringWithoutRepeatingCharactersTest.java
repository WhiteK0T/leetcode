package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N3LongestSubstringWithoutRepeatingCharactersTest {
    
    N3LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new N3LongestSubstringWithoutRepeatingCharacters();

    /*
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
     */
    @Test
    void lengthOfLongestSubstring1() {
        String input = "abcabcbb";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /*
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
     */
    @Test
    void lengthOfLongestSubstring2() {
        String input = "bbbbb";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 1;
        assertEquals(expected, actual);
    }

    /*
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    @Test
    void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /*
        Input: s = "aab"
        Output: 2
     */
    @Test
    void lengthOfLongestSubstring4() {
        String input = "aab";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 2;
        assertEquals(expected, actual);
    }
    /*
        Input: s = "aab"
        Output: 2
     */
    @Test
    void lengthOfLongestSubstring5() {
        String input = "dvdf";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /*
        Input: s = ""abcabcbb""
        Output: 3
     */
    @Test
    void lengthOfLongestSubstring6() {
        String input = "abcabcbb";
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        int expected = 3;
        assertEquals(expected, actual);
    }
}