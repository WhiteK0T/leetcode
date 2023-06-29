package medium;

public class N151ReverseWordsInAString {
    /*
        151. Reverse Words in a String

        Given an input string s, reverse the order of the words.
        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string
        should only have a single space separating the words. Do not include any extra spaces.

        Constraints:
            1 <= s.length <= 104
            s contains English letters (upper-case and lower-case), digits, and spaces ' '.
            There is at least one word in s.

        Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

        https://leetcode.com/problems/reverse-words-in-a-string/
     */

    public String reverseWordsFirst(String s) {
        StringBuilder result = new StringBuilder(s.length() + 8);
        String[] split = s.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i] != "") {
                result.append(split[i]).append(" ");
            }
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }

    public String reverseWordsRegExp(String s) {
        StringBuilder result = new StringBuilder(s.length() + 8);
        String[] split = s.trim().split("\\s+");
        for (int i = split.length - 1; i > 0; i--) {
            result.append(split[i]).append(" ");
        }
        result.append(split[0]);
        return result.toString();
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {   // trim
                i--;
                continue;
            }
            int tmp = i - 1;
            for (; tmp >= 0 && s.charAt(tmp) != ' '; tmp--);  // find next " "
            sb.append(s, tmp + 1, i + 1);
            sb.append(" ");
            i = tmp - 1;
        }
        if (sb.length() > 0) sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
