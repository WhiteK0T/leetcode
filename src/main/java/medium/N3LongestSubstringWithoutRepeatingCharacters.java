package medium;

import java.util.HashSet;
import java.util.Set;

public class N3LongestSubstringWithoutRepeatingCharacters {

    /*
        3. Longest Substring Without Repeating Characters
        Given a string s, find the length of the longest substring without repeating characters.

        Constraints:
            0 <= s.length <= 5 * 10 v 4
            s consists of English letters, digits, symbols and spaces.

        https://leetcode.com/problems/longest-substring-without-repeating-characters/
     */

    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChar = new HashSet<>();
        int maxLength = 0;
        for (int index = 0, start = 0; index < s.length(); ) {
            if (uniqueChar.add(s.charAt(index))) {
                index++;
                if (maxLength < uniqueChar.size()) {
                    maxLength = uniqueChar.size();
                }
                maxLength = Math.max(maxLength, uniqueChar.size());
            } else {
                uniqueChar.remove(s.charAt(start++));
            }
        }
        return maxLength;
    }
}
