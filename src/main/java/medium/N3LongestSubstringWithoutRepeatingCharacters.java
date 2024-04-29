package medium;

import java.util.Arrays;
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

    /*
        Решение с помощью метода скользящего окна
        1. Расширяем подстроку.
           Увеличиваем right пока в подстроке нет повторяющихся символов.
        2. Сужаем подстроку.
           Увеличиваем left пока в подстроке есть повторяющиеся символы.
        3. Повторяем П.1.
     */

    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstring_second(s);
    }

    public int lengthOfLongestSubstring_first(String s) {
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
                while (uniqueChar.contains(s.charAt(index))) {
                    uniqueChar.remove(s.charAt(start++));
                }
            }
        }
        return maxLength;
    }

    // В этом решении вместо Сета используем массив int в котором храним индекс буквы в строке,
    // а сама буква и есть индекс в массиве.
    public int lengthOfLongestSubstring_second(String s) {
        if (s == null || s.isEmpty()) return 0;
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        for (int right = 0, left = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charIndex[c] >= left) {
                left = charIndex[c] + 1;
            }
            charIndex[c] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
