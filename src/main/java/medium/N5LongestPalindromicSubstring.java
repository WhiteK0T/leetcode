package medium;

public class N5LongestPalindromicSubstring {
    /*
        5. Longest Palindromic Substring

        Given a string s, return the longest palindromic substring in s.

        Constraints:
            1 <= s.length <= 1000
            s consist of only digits and English letters.

        https://leetcode.com/problems/longest-palindromic-substring/
     */

    /*
        Идея проста и эффективна — для каждого символа в заданной строке считать его серединой палиндрома и
        расширять в обоих направлениях, чтобы найти палиндром максимальной длины. Для палиндрома четной длины
        считайте каждую соседнюю пару символов средней точкой.
     */

    /*
        Time complexity: O(N2), where N is the length of the input string
        Auxiliary Space: O(1), No extra space used.
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            // найти самый длинный палиндром нечетной длины с i в качестве средней точки
            int len1 = expandAroundCenter(s, i, i);
            // найти самый длинный палиндром четной длины с помощью i и i + 1 как средние точки.
            int len2 = expandAroundCenter(s, i, i + 1);
            int maxLen = Math.max(len1, len2);
            if (maxLen > length) {
                length = maxLen;
                start = i - (length - 1) / 2;
            }
        }
        return s.substring(start, start + length);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}